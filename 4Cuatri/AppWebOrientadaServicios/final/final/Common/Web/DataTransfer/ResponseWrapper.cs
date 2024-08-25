using System;
using System.Net;

namespace FirebaseRepository.Common
{
    public class ResponseWrapper<T>
    {
        public HttpStatusCode StatusCode { get; set; }
        public string Message { get; set; }
        public T Data { get; set; }
    }
}
