using final.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using final.Common.Web.Dto;
using final.Models;
using AutoMapper;

namespace final.Map
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