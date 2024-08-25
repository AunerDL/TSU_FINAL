using System.Collections.Generic;
using Uttt.Api.Rest.Domain;

namespace Uttt.Api.Rest.Infraestructure
{
    public interface IServicePersonas
    {
        bool Insertar(Personas _personas);
        bool Eliminar(int Id);
        Personas GetPersonasById(int Id);
        List<Personas> GetAllPersonas();
        bool Actualizar(int Id, Personas personas);
    }
}
