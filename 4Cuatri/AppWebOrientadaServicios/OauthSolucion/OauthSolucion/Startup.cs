using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(OauthSolucion.Startup))]
namespace OauthSolucion
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
