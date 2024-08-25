using System;
using System.Collections.Generic;
using System.Linq;
using Uttt.Api.Rest.Domain;
using Uttt.Api.Rest.Infraestructure;

namespace Uttt.Api.Rest.Services
{
    public class ServicesPersonas : IServicePersonas
    {
        private readonly BaseTestEntities testEntities = null;
        private readonly NLog.Logger logger = NLog.LogManager.GetCurrentClassLogger();
        public ServicesPersonas()
        {
            this.testEntities = new BaseTestEntities();
        }
        public bool Insertar(Personas _personas)
        {
            bool respuesta = false;
            try
            {
                this.testEntities.Database.Connection.Open();
                if (this.testEntities.Database.Connection.State == System.Data.ConnectionState.Open)
                {
                    var Transaction = this.testEntities.Database.BeginTransaction();
                    this.testEntities.Personas.Add(_personas);
                    if (this.testEntities.SaveChanges() > 0)
                        {
                    respuesta = true;
                        Transaction.Commit();
                    
                    }
                    else
                    {
                        respuesta = false;
                        this.testEntities.Database.BeginTransaction().Rollback();
                    }
                }
                return respuesta;
            }
            catch (Exception ex)
            {
                return respuesta;
            }
        }
        
        public bool  Eliminar(int Id)
        {
            bool result = false;
            try
            {
                
                this.testEntities.Database.Connection.Open();
                if (this.testEntities.Database.Connection.State == System.Data.ConnectionState.Open)
                {
                    var Transaction = this.testEntities.Database.BeginTransaction();
                    Personas personas = this.testEntities.Personas.Include("Direcciones").Include("Telefonos").Where(a=> a.Id == Id).FirstOrDefault();
                    if (personas != null) 
                    {
                        this.testEntities.Direcciones.RemoveRange(personas.Direcciones);
                        this.testEntities.Telefonos.Remove(personas.Telefonos);
                        //personas.Telefonos = null;
                        this.testEntities.Personas.Remove(personas);
                        this.testEntities.SaveChanges();
                        Transaction.Commit();
                        result = true;
                    }
                    else
                    {
                        Transaction.Rollback ();
                        result = false;
                    }
                }
                return result;

            }
            catch (Exception ex)
            {
                logger.Error($"La eliminacion no se realizo:{ex.Message}");
                return result;
            }
        }
        public Personas GetPersonasById(int Id)
        {
            Personas personas = new Personas ();
            try
            {
                this.testEntities.Database.Connection.Open();
                if(this.testEntities.Database.Connection.State==System.Data.ConnectionState.Open)
                {
                    personas = this.testEntities.Personas.Include("Direcciones").Include("Telefonos").Where(a=> a.Id == Id).FirstOrDefault ();
                    if (personas != null)
                    {
                        return personas;    
                    }
                    return personas;    
                }
                return personas;
            }
            catch (Exception ex)
            {
                logger.Error($"La consulta no se realizo:{ex.Message}");
                return null;    
            }
            
        }
        public List<Personas> GetAllPersonas()
        {
           return this.testEntities.Personas.Include("Direcciones").Include("Telefonos").ToList();
        }

        public bool Actualizar(int Id, Personas personas)
        {
            bool respuesta = false;
            try
            {
                this.testEntities.Database.Connection.Open();
                if (this.testEntities.Database.Connection.State == System.Data.ConnectionState.Open)
                {
                    var Transaction = this.testEntities.Database.BeginTransaction();
                    Personas personaOld = this.testEntities.Personas.Include("Telefonos").FirstOrDefault(a=>a.Id==Id);
                    if(personaOld != null)
                    {
                        personaOld.Nombre = personas.Nombre;
                        personaOld.ApellidoPaterno = personas.ApellidoPaterno;
                        personaOld.ApellidoMaterno = personas.ApellidoMaterno;
                        personaOld.Rfc = personas.Rfc;
                        personaOld.Edad = personas.Edad;

                        personaOld.Telefonos.TelefonoCelular = personas.Telefonos.TelefonoCelular;
                        personaOld.Telefonos.TelefonoCasa = personas.Telefonos.TelefonoCasa;
                        //this.testEntities.Personas.Add(personaOld);
                        this.testEntities.Entry(personaOld).State = System.Data.Entity.EntityState.Modified;
                        if(this.testEntities.SaveChanges()>0) {
                            Transaction.Commit();
                            respuesta = true;
                            return respuesta;
                        }
                        else
                        {
                            Transaction.Rollback();
                            return respuesta;
                        }
                    }
                }
                return respuesta;
            }
            catch (Exception ex)
            {
                logger.Error($"La actualizacion no se realizo:{ex.Message}");
                return respuesta;
            }
        }
    }
}