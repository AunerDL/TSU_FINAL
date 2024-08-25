using MongoDB.Bson;
using NUEVO.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NUEVO.Infraestructure
{
    public interface IArticuloRepository
    {
        List<Articulo> GetAll();
        Articulo GetById(ObjectId id);
        void Create(Articulo articulo);
        void Update(ObjectId id, Articulo articulo);
        void Delete(ObjectId id);

        Articulo GetByName(string name);

        List<Articulo> GetPersonsByName(string name);
    }
}
