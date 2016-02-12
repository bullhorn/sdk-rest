package com.bullhornsdk.data.api;

public class BullhornRestCredentials {

	private String username;

	private String password;

	private String restTokenUrl;

	private String restClientId;

	private String restClientSecret;

	private String restLoginUrl;

	private String restSessionMinutesToLive;

	private String restAuthorizeUrl;

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
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((restAuthorizeUrl == null) ? 0 : restAuthorizeUrl.hashCode());
		result = prime * result + ((restClientId == null) ? 0 : restClientId.hashCode());
		result = prime * result + ((restClientSecret == null) ? 0 : restClientSecret.hashCode());
		result = prime * result + ((restLoginUrl == null) ? 0 : restLoginUrl.hashCode());
		result = prime * result + ((restSessionMinutesToLive == null) ? 0 : restSessionMinutesToLive.hashCode());
		result = prime * result + ((restTokenUrl == null) ? 0 : restTokenUrl.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (restAuthorizeUrl == null) {
			if (other.restAuthorizeUrl != null)
				return false;
		} else if (!restAuthorizeUrl.equals(other.restAuthorizeUrl))
			return false;
		if (restClientId == null) {
			if (other.restClientId != null)
				return false;
		} else if (!restClientId.equals(other.restClientId))
			return false;
		if (restClientSecret == null) {
			if (other.restClientSecret != null)
				return false;
		} else if (!restClientSecret.equals(other.restClientSecret))
			return false;
		if (restLoginUrl == null) {
			if (other.restLoginUrl != null)
				return false;
		} else if (!restLoginUrl.equals(other.restLoginUrl))
			return false;
		if (restSessionMinutesToLive == null) {
			if (other.restSessionMinutesToLive != null)
				return false;
		} else if (!restSessionMinutesToLive.equals(other.restSessionMinutesToLive))
			return false;
		if (restTokenUrl == null) {
			if (other.restTokenUrl != null)
				return false;
		} else if (!restTokenUrl.equals(other.restTokenUrl))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tusername: ");
		builder.append(username);
		builder.append("\n\tpassword: ");
		builder.append(password);
		builder.append("\n\trestTokenUrl: ");
		builder.append(restTokenUrl);
		builder.append("\n\trestClientId: ");
		builder.append(restClientId);
		builder.append("\n\trestClientSecret: ");
		builder.append(restClientSecret);
		builder.append("\n\trestLoginUrl: ");
		builder.append(restLoginUrl);
		builder.append("\n\trestSessionMinutesToLive: ");
		builder.append(restSessionMinutesToLive);
		builder.append("\n\trestAuthorizeUrl: ");
		builder.append(restAuthorizeUrl);
		builder.append("\n}");
		return builder.toString();
	}

}
