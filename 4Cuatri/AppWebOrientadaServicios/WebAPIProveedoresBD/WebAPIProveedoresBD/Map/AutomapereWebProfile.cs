using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using WebAPIProveedoresBD.Common.Web.Dto;
using WebAPIProveedoresBD.Models;
using AutoMapper;

namespace WebAPIProveedoresBD.Map
{
    public class AutomapereWebProfile
    {
        public AutomapereWebProfile()
        {
            CreateMap<ProveedorDto, Proveedor>().ReverseMap();
        }

        public static void Run()
        {
            AutoMapper.Mapper.Initialize(a =>
            {
                a.AddProfile<AutomapereWebProfile>();
            });
        }
    }
}