using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using WebAPIProveedoresBD.Infraestructure;
using WebAPIProveedoresBD.Models;

namespace WebAPIProveedoresBD.Repository
{
    public class ProveedorRepository : IProveedorRepository
    {
        private readonly IMongoCollection<Proveedor> _proveedor;
        public ProveedorRepository()
        {
            var client = new MongoClient("mongodb://localhost:27017");
            var database = client.GetDatabase("pos_ventas");
            _proveedor = database.GetCollection<Proveedor>("Proveedor");
        }
        public void Create(Proveedor proveedor)
        {
            _proveedor.InsertOne(proveedor);
        }
        public void Delete(ObjectId Id)
        {
            _proveedor.DeleteOne(p => p.Id == Id);
        }
        public List<Proveedor> GetAll()
        {
            return _proveedor.Find(p => true).ToList();
        }
        public Proveedor GetIdName(ObjectId Id)
        {
            return _proveedor.FindOneAndDelete(p => p.Id == Id);
        }
        public Proveedor GetById(ObjectId id)
        {
            return _proveedor.Find(p => p.Id == id).FirstOrDefault();
        }
        public void Update(ObjectId id, Proveedor proveedor)
        {
            _proveedor.ReplaceOne(p => p.Id == id, proveedor);
        }
        public Proveedor GetByName(String name)
        {
            return _proveedor.AsQueryable().Where(p => p.Name.Equals(name)).FirstOrDefault();
        }
    }
}