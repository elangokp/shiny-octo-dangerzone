/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.formObjects;

/**
 * @author aa
 *
 */
public class MajesticSeoLoginFormObject {
	
	private String email;
	
	private String password;
	
	private Boolean rememberMe;
	
	public MajesticSeoLoginFormObject() {
		
	}

	/**
	 * @param email
	 * @param password
	 * @param rememberMe
	 */
	public MajesticSeoLoginFormObject(String email, String password,
			Boolean rememberMe) {
		super();
		this.email = email;
		this.password = password;
		this.rememberMe = rememberMe;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rememberMe
	 */
	public Boolean getRememberMe() {
		return rememberMe;
	}

	/**
	 * @param rememberMe the rememberMe to set
	 */
	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	
	

}
