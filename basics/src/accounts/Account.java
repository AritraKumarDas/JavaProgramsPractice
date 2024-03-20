package accounts;

class Account {
	private String customerName;
	private int accountNo;
	
	Account(String a, int b){
		this.customerName = a;
		this.accountNo=b;
	}
	
	public void display() {
		System.out.println("Customer Name = " + customerName);
		System.out.println("Account No = " + accountNo);
	}
}
