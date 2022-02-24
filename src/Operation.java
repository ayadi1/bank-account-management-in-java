import java.util.Date;

public class Operation {
	private Date date;
	private int balance;
	private String type;

	public Operation(int balance, String type) {
		this.balance = balance;
		this.type = type;
		this.date = new Date();
	}

	// methods
	// ----------------------GET-------------------------
	public String GetData() {
		return this.date.toString();
	}

	public String GetType() {
		return this.type;
	}

	public int GetBalance() {
		return this.balance;
	}

	public String toString() {
		return "type : " + this.type + " | Balance : " + this.balance + " | Date : " + this.date.toString();
	}

}
