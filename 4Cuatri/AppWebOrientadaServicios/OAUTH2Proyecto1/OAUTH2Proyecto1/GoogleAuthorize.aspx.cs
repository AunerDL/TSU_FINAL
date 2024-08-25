using Google.Apis.Auth.OAuth2;
using Google.Apis.Gmail.v1;
using Google.Apis.Util.Store;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace OAUTH2Proyecto1
{
    public partial class GoogleAuthorize : System.Web.UI.Page
    {
        public static string ApplicationName = "OAUTH2Proyecto1";
        public static string ClientId = "302656919900-4hd9m22h33bq1mg7i485q7110plc82lq.apps.googleusercontent.com";
        public static string ClientSecret = "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";

        public static string[] Scopes =
        {
            GmailService.Scope.GmailCompose,
            GmailService.Scope.GmailSend
        };
        public static UserCredential GetUserCredential(out string error)
        {
            UserCredential credential = null;
            error = null;
            try
            {
                credential = GoogleWebAuthorizationBroker.AuthorizeAsync(
                new ClientSecrets
                {
                    ClientId = ClientId,
                    ClientSecret = ClientSecret

                },
                Scopes,
                Environment.UserName,
                CancellationToken.None,
                new FileDataStore("Google Oauth2 Client App")).Result;
            }
            catch (Exception ex)
            {
                credential = null;
                error = "Failed to UserCredential Initialization: " + ex.ToString();
            }

            return credential;
        }
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        

        protected void btnAuthorize_Click1(object sender, EventArgs e)
        {
            string credentialError = string.Empty;
            string refreshToken = string.Empty;

            UserCredential credential = GetUserCredential(out credentialError);
            if (credential != null && string.IsNullOrWhiteSpace(credentialError))
            {
                refreshToken = credential.Token.RefreshToken;
            }
        }
    }
}