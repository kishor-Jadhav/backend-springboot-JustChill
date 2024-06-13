package com.justchill.example.models;

public class JwdRequest {
	 private String email;
	 private String password;
 
		public JwdRequest(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}
		public JwdRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "JwdRequest [email=" + email + ", password=" + password + "]";
		}
 
}
