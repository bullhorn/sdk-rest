package com.bullhornsdk.data.exception;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;

public class TestAuthorizationCodeException extends BaseTest {

    @Test
    public void testAccountLockedOut() {
        RestApiException exception = new AuthorizationCodeException("", ACCOUNT_LOCKED_OUT_HTML);

        Assert.assertEquals("Account is locked out.", exception.getDetailMessage());
    }

    @Test
    public void testInvalidCredentials() {
        RestApiException exception = new AuthorizationCodeException("", INVALID_CREDENTIALS_HTML);

        Assert.assertEquals("Invalid credentials.", exception.getDetailMessage());
    }

    @Test
    public void testBullhornDataInvalidCredentials() {
        BullhornRestCredentials restCredentials = new BullhornRestCredentials();
        restCredentials.setUsername("octopus.api.user");
        restCredentials.setPassword("invalidPassword");
        restCredentials.setRestClientId("b627302e-e971-4a8b-b122-91c622f6bf39");

        try {
            new StandardBullhornData(restCredentials);
        } catch (RestApiException e) {
            Assert.assertEquals("Invalid credentials.", e.getDetailMessage());
        }
    }

    private static final String ACCOUNT_LOCKED_OUT_HTML = "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "<!DOCTYPE html>\n" +
        "<html>\n" +
        "    <head>\n" +
        "        <meta charset=\"utf-8\">\n" +
        "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
        "        <title>Bullhorn | Log in</title>\n" +
        "        <meta name=\"HandheldFriendly\" content=\"True\">\n" +
        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\n" +
        "        <meta name=\"apple-touch-fullscreen\" content=\"yes\">\n" +
        "        <link href='//fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900' rel='stylesheet' type='text/css'>\n" +
        "        <link href=\"//cdn.rawgit.com/bullhorn/bullhorn-icons/development/fonts/Bullhorn-Glyphicons.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
        "        <link rel=\"stylesheet\" href=\"/oauth/css/login.css\">\n" +
        "        <link rel='localizations' type='text/json' href='l10n/localizations.json' />\n" +
        "        <script type=\"text/javascript\" src=\"js/json2.js\"></script>\n" +
        "        <script type=\"text/javascript\" src=\"js/login.js\"></script>\n" +
        "        <script type=\"text/javascript\" src=\"js/l10n.js\"></script>\n" +
        "        <script type=\"text/javascript\">\n" +
        "            String.toLocaleString(\"l10n/localizations.json\");\n" +
        "        </script>\n" +
        "    </head>\n" +
        "    <body>\n" +
        "        <div class=\"login\">\n" +
        "            \n" +
        "                <div class=\"backheader\">\n" +
        "                    <a href=\"null\" id=\"usernameUrlLink\">\n" +
        "                        <i class=\"bhi-previous\"></i>\n" +
        "                        <span id=\"usernameUrl\">Use a different account</span>\n" +
        "                    </a>\n" +
        "                </div>\n" +
        "            \n" +
        "            <div class=\"container\">\n" +
        "                <div class=\"logo\"></div>\n" +
        "                <form method=\"POST\" name=\"loginForm\" class=\"content\">\n" +
        "                \t\n" +
        "                    \t<input type=\"hidden\" name=\"username\" value=\"octopus.api.user.3\" >\n" +
        "                    \t<div id=\"usernameText\"><span>Hello, octopus.api.user.3!</span></div>\n" +
        "                    \n" +
        "                    <div class=\"iconholder passwordholder\">\n" +
        "                        <i class=\"bhi-lock\"></i>\n" +
        "                        <input type=\"password\" name=\"password\" placeholder=\"Password\" id=\"pw\" onkeyup=\"checkLoginDisabled()\">\n" +
        "                    </div>\n" +
        "\n" +
        "                    <div class=\"errors\">\n" +
        "                        \n" +
        "                            <p class=\"error\">\n" +
        "                                Account is locked out.\n" +
        "                            </p>\n" +
        "                        \n" +
        "                    </div>\n" +
        "\n" +
        "                    <input type=\"hidden\" name='action' value='Login'>\n" +
        "                    <input id=\"btn\" type=\"submit\" value=\"Log in\" disabled>\n" +
        "                </form>     \n" +
        "            </div> \n" +
        "        </div>\n" +
        "        <footer>\n" +
        "            <p>\n" +
        "                <a href=\"//www.bullhorn.com/privacy/\" target=\"_blank\">Privacy Policy</a>\n" +
        "                \n" +
        "            </p>\n" +
        "        </footer>\n" +
        "        <script type=\"text/javascript\">\n" +
        "            if(document.getElementById('un')!=undefined) {\n" +
        "                document.getElementById('un').placeholder = \"Username\".localize();\n" +
        "            }\n" +
        "            document.getElementById('pw').placeholder = \"Password\".localize();\n" +
        "            document.getElementById('btn').value = \"Log in\".localize();\n" +
        "        </script>\n" +
        "    </body>\n" +
        "</html>\n";

    private static final String INVALID_CREDENTIALS_HTML = "<!DOCTYPE html>\n" +
        "<html>\n" +
        "\n" +
        "<head>\n" +
        "    <meta charset=\"utf-8\">\n" +
        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
        "    <title>Bullhorn | Log in</title>\n" +
        "    <meta name=\"HandheldFriendly\" content=\"True\">\n" +
        "    <meta name=\"viewport\"\n" +
        "        content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\n" +
        "    <meta name=\"apple-touch-fullscreen\" content=\"yes\">\n" +
        "    <link href='//fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900' rel='stylesheet' type='text/css'>\n" +
        "    <link href=\"//cdn.rawgit.com/bullhorn/bullhorn-icons/development/fonts/Bullhorn-Glyphicons.css\" rel=\"stylesheet\"\n" +
        "        type=\"text/css\">\n" +
        "    <link rel=\"stylesheet\" href=\"/oauth/css/login.css\">\n" +
        "    <link rel='localizations' type='text/json' href='l10n/localizations.json' />\n" +
        "    <script type=\"text/javascript\" src=\"js/json2.js\"></script>\n" +
        "    <script type=\"text/javascript\" src=\"js/login.js\"></script>\n" +
        "    <script type=\"text/javascript\" src=\"js/l10n.js\"></script>\n" +
        "    <script type=\"text/javascript\">\n" +
        "        String.toLocaleString(\"l10n/localizations.json\");\n" +
        "    </script>\n" +
        "</head>\n" +
        "\n" +
        "<body>\n" +
        "    <div class=\"login\">\n" +
        "\n" +
        "        <div class=\"backheader\">\n" +
        "            <a href=\"null\" id=\"usernameUrlLink\">\n" +
        "                <i class=\"bhi-previous\"></i>\n" +
        "                <span id=\"usernameUrl\">Use a different account</span>\n" +
        "            </a>\n" +
        "        </div>\n" +
        "\n" +
        "        <div class=\"container\">\n" +
        "            <div class=\"logo\"></div>\n" +
        "            <form method=\"POST\" name=\"loginForm\" class=\"content\">\n" +
        "\n" +
        "                <input type=\"hidden\" name=\"username\" value=\"octopus.api.user.3\" >\n" +
        "                <div id=\"usernameText\"><span>Hello, octopus.api.user.3!</span></div>\n" +
        "\n" +
        "                <div class=\"iconholder passwordholder\">\n" +
        "                    <i class=\"bhi-lock\"></i>\n" +
        "                    <input type=\"password\" name=\"password\" placeholder=\"Password\" id=\"pw\" onkeyup=\"checkLoginDisabled()\">\n" +
        "                </div>\n" +
        "\n" +
        "                <div class=\"errors\">\n" +
        "\n" +
        "                    <p class=\"error\">\n" +
        "                        Invalid credentials.\n" +
        "                    </p>\n" +
        "\n" +
        "                </div>\n" +
        "\n" +
        "                <input type=\"hidden\" name='action' value='Login'>\n" +
        "                <input id=\"btn\" type=\"submit\" value=\"Log in\" disabled>\n" +
        "            </form>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <footer>\n" +
        "        <p>\n" +
        "            <a href=\"//www.bullhorn.com/privacy/\" target=\"_blank\">Privacy Policy</a>\n" +
        "\n" +
        "        </p>\n" +
        "    </footer>\n" +
        "    <script type=\"text/javascript\">\n" +
        "        if(document.getElementById('un')!=undefined) {\n" +
        "                document.getElementById('un').placeholder = \"Username\".localize();\n" +
        "            }\n" +
        "            document.getElementById('pw').placeholder = \"Password\".localize();\n" +
        "            document.getElementById('btn').value = \"Log in\".localize();\n" +
        "    </script>\n" +
        "</body>\n" +
        "\n" +
        "</html>";

}
