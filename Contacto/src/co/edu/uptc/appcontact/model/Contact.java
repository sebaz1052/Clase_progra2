package co.edu.uptc.appcontact.model;

public class Contact {
 
	private String name;
	private String conDoc;
	private String phoneNumber;
	private String email;
	private String countryCode;
	
	public Contact() {
		
	}

	public Contact(String name, String conDoc, String phoneNumber, String email, String countryCode) {
		super();
		this.name = name;
		this.conDoc = conDoc;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConDoc() {
		return conDoc;
	}

	public void setConDoc(String conDoc) {
		this.conDoc = conDoc;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
}
