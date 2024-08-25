using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using WebAPIArticulo.Common.Web.Dto;
using WebAPIArticulo.Models;

namespace WebAPIArticulo.Map
{
    public class AutomapereWebProfile : Profile
    {
        public AutomapereWebProfile()
        {
            CreateMap<ArticuloDto, Articulo>().ReverseMap();
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