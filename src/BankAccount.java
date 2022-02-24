import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
	private int balance;
	private String date;
	private int accountNumber;
	private Person owner = new Person();
	private int numberOfcredited = 0;
	private int numberOfdebit = 0;
	private static int numberOfAccount = 0;
	private ArrayList<Operation> operation = new ArrayList<Operation>();

	// ------------ Constructors Start ------------------------------------

	// default Constructors
	public BankAccount() {
		numberOfAccount++;
	}

	// Constructors with date and balance
	public BankAccount(int accountNumber, String date, int balance, Person owner) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.date = date;
		this.owner = owner;
		numberOfAccount++;
	}

	// Constructors without date and balance and owner
	public BankAccount(int accountNumber) {
		numberOfAccount++;
		this.balance = 0;
		this.accountNumber = accountNumber;
		Date date = new Date();
		this.date = date.toString();

	}

	// ------------ Constructors end ------------------------------------
	public void Credited(int newBalance) {
		this.numberOfcredited++;
		this.balance += newBalance;
		this.operation.add(new Operation(newBalance, "Credited"));
	}

	public void Debit(int newBalance) {
		this.balance -= newBalance;
		this.numberOfdebit++;
		this.operation.add(new Operation(-newBalance, "Debit"));
	}

	// setData
	public void SetAccountNumber(int newAccountNumber) {
		this.accountNumber = newAccountNumber;
	}

	public void SetDate(String newDate) {
		this.date = newDate;
	}
	// Get data

	public int GetAccountNumber() {
		return this.accountNumber;
	}

	public int GetBalance() {
		return this.balance;
	}

	public String GetDate() {
		return this.date;
	}

	public int GetNumberOfCredited() {
		return this.numberOfcredited;
	}

	public int GetNumberOfDebit() {
		return this.numberOfdebit;
	}

	public static int GetNumberOfAccount() {
		return numberOfAccount;
	}

	public void GetData() {
		System.out.println("##################################");
		System.out.println("account nember : " + this.accountNumber);
		System.out.println("creation date : " + this.date);
		System.out.println("account balance : " + this.balance);
		System.out.println("owner : " + this.owner.GetFirstName() + " " + this.owner.GetLastName());
		System.out.println("##################################");
	}

	public void GetOwnerProfile() {
		System.out.println("##################################");
		System.out.println("first name : " + this.owner.GetFirstName());
		System.out.println("last name : " + this.owner.GetLastName());
		System.out.println("Email : " + this.owner.GetEmail());
		System.out.println("Tele : " + this.owner.GetTele());
		System.out.println("Address : " + this.owner.GetAddress().GetAddress());
		System.out.println("City : " + this.owner.GetAddress().GetCity());
		System.out.println("country : " + this.owner.GetAddress().GetCountry());
		System.out.println("##################################");
	}

	public void ShowHistory() {
		for (Operation operation : this.operation) {
			System.out.println("--------------------------------------");
			System.out.println(operation.toString());

		}
	}
}
