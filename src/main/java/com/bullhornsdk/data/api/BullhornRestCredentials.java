package com.bullhornsdk.data.api;

public class BullhornRestCredentials {

    private String restUrl;

    private String bhRestToken;

    private String username;

    private String password;

    private String restTokenUrl;

    private String restClientId;

    private String restClientSecret;

    private String restLoginUrl;

    private String restSessionMinutesToLive;

    private String restAuthorizeUrl;

    public String getBhRestToken() {
        return bhRestToken;
    }

    public void setBhRestToken(String bhRestToken) {
        this.bhRestToken = bhRestToken;
    }

    public String getRestUrl() {
        return restUrl;
    }

    public void setRestUrl(String restUrl) {
        this.restUrl = restUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestTokenUrl() {
        return restTokenUrl;
    }

    public void setRestTokenUrl(String restTokenUrl) {
        this.restTokenUrl = restTokenUrl;
    }

    public String getRestClientId() {
        return restClientId;
    }

    public void setRestClientId(String restClientId) {
        this.restClientId = restClientId;
    }

    public String getRestClientSecret() {
        return restClientSecret;
    }

    public void setRestClientSecret(String restClientSecret) {
        this.restClientSecret = restClientSecret;
    }

    public String getRestLoginUrl() {
        return restLoginUrl;
    }

    public void setRestLoginUrl(String restLoginUrl) {
        this.restLoginUrl = restLoginUrl;
    }

    public String getRestSessionMinutesToLive() {
        return restSessionMinutesToLive;
    }

    public void setRestSessionMinutesToLive(String restSessionMinutesToLive) {
        this.restSessionMinutesToLive = restSessionMinutesToLive;
    }

    public String getRestAuthorizeUrl() {
        return restAuthorizeUrl;
    }

    public void setRestAuthorizeUrl(String restAuthorizeUrl) {
        this.restAuthorizeUrl = restAuthorizeUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bhRestToken == null) ? 0 : bhRestToken.hashCode());
        result = prime * result + ((restUrl == null) ? 0 : restUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BullhornRestCredentials other = (BullhornRestCredentials) obj;
        if (bhRestToken == null) {
            if (other.bhRestToken != null)
                return false;
        } else if (!bhRestToken.equals(other.bhRestToken))
            return false;
        if (restUrl == null) {
            if (other.restUrl != null)
                return false;
        } else if (!restUrl.equals(other.restUrl))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName());
        builder.append(" {\n\tbhRestToken: ");
        builder.append(bhRestToken);
        builder.append(" {\n\trestUrl: ");
        builder.append(restUrl);
        builder.append("\n}");
        return builder.toString();
    }

}
