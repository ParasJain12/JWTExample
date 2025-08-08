package com.jwt.test.model;

public class JWTResponse {

	private String jwtToken;
	private String username;

	// Private constructor for builder
	private JWTResponse(Builder builder) {
		this.jwtToken = builder.jwtToken;
		this.username = builder.username;
	}

	// Getters
	public String getJwtToken() {
		return jwtToken;
	}

	public String getUsername() {
		return username;
	}

	// Manual Builder Class
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

	// Static method to start building
	public static Builder builder() {
		return new Builder();
	}
}