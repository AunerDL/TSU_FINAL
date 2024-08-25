using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GoogleApiAccessApplication.Common
{
    public class GoogleApiHelper
    {
        public static string ApplicationName = "Google Api DotNetCore Web Client";

        public static string ClientId = "1083018407073-1rfsiguiahge9ectlcto337cv9v1nf11.apps.googleusercontent.com";

        public static string ClientSecret = "N6o2DmHfnhlFqfH8f0UiwT8X";

        public static string RedirectUri = "http://localhost:21955//Home/OauthCallback";

        public static string OauthUri = "https://accounts.google.com/o/oauth2/auth?";

        public static string Scopes = "https://www.googleapis.com/auth/userinfo.email";

        public static string GetOauthUri(string extraParam) 
        {
            StringBuilder sbUri = new StringBuilder(OauthUri);
            sbUri.Append("client_id=" + ClientId);
            sbUri.Append("&redirect_uri=" + RedirectUri);
            sbUri.Append("&response_type=" + "code");
            sbUri.Append("&scope=" + Scopes);
            sbUri.Append("&access_type=" + "offline");
            sbUri.Append("&state=" + extraParam);

            return sbUri.ToString();
        }
    }
}
