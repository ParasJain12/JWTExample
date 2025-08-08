package com.jwt.test.model;

public class JWTResponse {

	private String jwtToken;
	private String username;

	private JWTResponse(Builder builder) {
		this.jwtToken = builder.jwtToken;
		this.username = builder.username;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public static class Builder {
		private String jwtToken;
		private String username;

		public Builder jwtToken(String jwtToken) {
			this.jwtToken = jwtToken;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public JWTResponse build() {
			return new JWTResponse(this);
		}
	}

	public static Builder builder() {
		return new Builder();
	}
}