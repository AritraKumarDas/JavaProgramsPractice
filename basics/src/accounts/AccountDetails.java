package accounts;

class AccountDetails extends CurrentAccount {

	int depositAmount;
	int withdrawalAmount ;
	
	
	
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		this.depositAmount = d;
		this.withdrawalAmount = e;
	}
	
	public void display() {
		super.display();
		System.out.println("Deposit Amount = " + depositAmount);
		System.out.println("Withdrawal Amount = " + withdrawalAmount);
	}
}
