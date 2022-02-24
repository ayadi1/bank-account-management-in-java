
public class Address {
	private String city;
	private String country;
	private String postalCode;
	private String address;

	// --------------------------Constructors------------------------------------------------
	public Address() {

	}

	public Address(String city, String country, String postalCode, String address) {
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}

	// methods
	// ----------------
	// ----------------------------GET----------------------------------------------------------
	public String GetCity() {
		return this.city;
	}

	public String GetCountry() {
		return this.country;
	}

	public String GetPostalCode() {
		return this.postalCode;
	}

	public String GetAddress() {
		return this.address;
	}

	// ---------------------SET-----------------------------------------------------------------
	public void SetCity(String newCity) {
		this.city = newCity;
	}

	public void SetCountry(String newCountry) {
		this.country = newCountry;
	}

	public void SetPostalCode(String newPostalCode) {
		this.postalCode = newPostalCode;
	}

	public void SetAddress(String newAddress) {
		this.address = newAddress;
	}
}
