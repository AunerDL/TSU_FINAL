using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using final.Infraestructure;
using final.Models;
using MongoDB.Bson;
using MongoDB.Driver;

namespace final.Repository
{
    public class ArticuloRepository : IArticuloRepository
    {
        private readonly IMongoCollection<Articulo> _articulo;
        public ArticuloRepository()
        {
            var client = new MongoClient("mongodb://localhost:27017");
            var database = client.GetDatabase("pos_ventas");
            _articulo = database.GetCollection<Articulo>("Articulo");
        }
        public void Create(Articulo articulo)
        {
            _articulo.InsertOne(articulo);
        }
        public void Delete(string DescripCorta)
        {
            _articulo.DeleteOne(p => p.DescripCorta == DescripCorta);
        }
        public List<Articulo> GetAll()
        {
            return _articulo.Find(p => true).ToList();
        }
        public void Update(ObjectId id, Articulo articulo)
        {
            _articulo.ReplaceOne(p => p.Id == id, articulo);
        }
        public List<Articulo> GetDescriptionCorta(String descriptCorta)
        {
            return _articulo.Find(p => p.DescripCorta == descriptCorta).ToList();
        }
    }
}

//public Articulo GetIdName(ObjectId Id)
//{
//    return _articulo.FindOneAndDelete(p => p.Id == Id);
//}
//public Articulo GetById(ObjectId id)
//{
//    return _articulo.Find(p => p.Id == id).FirstOrDefault();
//}