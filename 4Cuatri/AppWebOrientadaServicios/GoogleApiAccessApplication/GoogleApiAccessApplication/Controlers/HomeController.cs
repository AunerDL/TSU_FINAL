using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using GoogleApiAccessApplication.Models;
using GoogleApiAccessApplication.Common;

namespace GoogleApiAccessApplication.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Authenticate(string email) 
        {
            return RedirectPermanent(GoogleApiHelper.GetOauthUri(email));
        }

        public IActionResult OauthCallback(string code,string error, string state)
        {
            try
            {
                if (!string.IsNullOrEmpty(code)) 
                {
                    ViewBag.Message = "Successfull: " + code;
                }
                if (!string.IsNullOrEmpty(error)) 
                {
                    ViewBag.Message = "Error: " + error;
                }
                if (!string.IsNullOrEmpty(state)) 
                {
                    ViewBag.MailAddress = state;
                }
            }
            catch (Exception ex)
            {
                throw ex;
            }

            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
