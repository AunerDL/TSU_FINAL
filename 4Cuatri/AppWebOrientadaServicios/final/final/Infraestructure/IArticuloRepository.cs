using final.Models;
using MongoDB.Bson;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace final.Infraestructure
{
    public interface IArticuloRepository
    {
        List<Articulo> GetAll();

        void Create(Articulo articulo);
        void Update(ObjectId id, Articulo articulo);
        void Delete(string desCorta);

        //Articulo GetByName(string name);

        List<Articulo> GetDescriptionCorta(string descripCorta);
    }
}
