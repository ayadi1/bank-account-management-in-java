
public class Main {
	public static void main(String[] args) {
		Address myAddress = new Address("berkane", "morocco", "60323", "darna");
		Person me = new Person("oussama", "ayadi", "ayadi@gmail.com", "0626005713", myAddress);
		BankAccount cb1 = new BankAccount(1, "01/01/2020", 10000, me);
		cb1.GetData();
	}
}
