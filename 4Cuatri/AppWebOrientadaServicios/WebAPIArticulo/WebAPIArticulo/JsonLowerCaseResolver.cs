using Newtonsoft.Json.Serialization;

namespace WebAPIArticulo
{
    internal class JsonLowerCaseResolver : IContractResolver
    {
        public SnakeCaseNamingStrategy NamingStrategy { get; set; }
    }
}