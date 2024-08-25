using AutoMapper;
using NUEVO.Common.Web.Dto;
using NUEVO.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace NUEVO.Map
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