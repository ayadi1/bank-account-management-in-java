import java.util.Date;

public class Operation {
	private Date date;
	private int balance;
	private String type;
	private boolean isFailed;

	public Operation(int balance, String type, boolean isFailed) {
		this.balance = balance;
		this.type = type;
		this.date = new Date();
		this.isFailed = isFailed;
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
		return "type : " + this.type + " | Balance : " + this.balance + "| isFailed : " + this.isFailed + " | Date : "
				+ this.date.toString();
	}

	public boolean GetIsFailed() {
		return this.isFailed;
	}
}
