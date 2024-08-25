using MongoDB.Bson;
using MongoDB.Driver;
using NUEVO.Infraestructure;
using NUEVO.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace NUEVO.Repository
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
        public void Create(Articulo persona)
        {
            _articulo.InsertOne(persona);
        }
        public void Delete(ObjectId Id)
        {
            _articulo.DeleteOne(p => p.CodigoBarras == Id);
        }
        public List<Articulo> GetAll()
        {
            return _articulo.Find(p => true).ToList();
        }
        public Articulo GetIdName(ObjectId Id)
        {
            return _articulo.FindOneAndDelete(p => p.CodigoBarras == Id);
        }
        public Articulo GetById(ObjectId id)
        {
            return _articulo.Find(p => p.CodigoBarras == id).FirstOrDefault();
        }
        public void Update(ObjectId CodigoBarras, Articulo articulo)
        {
            _articulo.ReplaceOne(p => p.CodigoBarras == CodigoBarras, articulo);
        }
        public Articulo GetByName(String name)
        {
            return _articulo.AsQueryable().Where(p => p.DescripNormal.Equals(name)).FirstOrDefault();
        }

        List<Articulo> IArticuloRepository.GetPersonsByName(string name)
        {
            throw new NotImplementedException();
        }
    }
}