using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using AutoMapper;
using Uttt.Api.Rest.Domain;
using Uttt.Api.Rest.Dto;

namespace Uttt.Api.Rest.Mapper
{
    public class ManagerProfile : Profile
    {
        public ManagerProfile()
        {
            CreateMap<Telefonos, TelefonosDto>().ReverseMap();
            CreateMap<Direcciones, DireccionesDto>().ReverseMap();
            CreateMap<Personas, PersonasDto>().ReverseMap()
                .ForMember(d => d.Telefonos, o => o.MapFrom(a => a.Telefonos))
                .ForMember(D => D.Direcciones, o => o.MapFrom(l => l.Direcciones));
        }

        public static void Run ()
        {
            AutoMapper.Mapper.Initialize(a =>
            {
                a.AddProfile<ManagerProfile>();
            });
        }
    }
}
