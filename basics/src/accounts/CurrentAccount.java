package accounts;

class CurrentAccount extends Account {

	private int currentBalance;
	
	CurrentAccount(String a, int b, int c){
		super(a,b);
		this.currentBalance = c;
	}
	
	public void display() {
		super.display();
		System.out.println("Current Balance = " + currentBalance);
	}
}
