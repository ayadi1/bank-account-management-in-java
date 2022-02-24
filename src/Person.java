
public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private String tele;
	private Address address;

	// --------------------------Constructors------------------------------------------------
	public Person() {

	}

	public Person(String firstName, String lastName, String email, String tele, Address address) {
		this.address = address;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tele = tele;
	}

	// methods
	// ----------------- GET-----------------------
	public String GetFirstName() {
		return this.firstName;
	}

	public String GetLastName() {
		return this.lastName;
	}

	public String GetEmail() {
		return this.email;
	}

	public String GetTele() {
		return this.tele;
	}

	public Address GetAddress() {
		return this.address;
	}
	// --------------------- SET---------------------------------

	public void SetEmail(String newEmail) {
		this.email = newEmail;
	}

	public void SetLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public void SetAddress(Address newAddress) {
		this.address = newAddress;
	}

	public void SetTele(String newTele) {
		this.tele = newTele;
	}

	public void SetFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
}
