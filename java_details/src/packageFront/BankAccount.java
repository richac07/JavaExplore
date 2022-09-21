package packageFront;

public class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double startingBalance) {
		this.owner = owner;
		this.balance = Math.max(startingBalance, 0);
	}
	
	//encapsulation, to get the owner details use the getter and setter
	public String getowner() {
		return this.owner;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void withdrawMoney(double amt) {
		double remBalance = this.balance -amt;
		System.out.println(this.owner +" "+ "- Your remaining balance is " +  " "+ remBalance);
		
	}
	
	public double justDeposit(double amt) {
		if (amt > 0) {
			// this will update the balance through out
			this.balance= this.balance + amt;
			return balance;
		}
		return 0;
	}
	
	public void depositMoney(double amt) {
		//this will not update the balance throughout, if call for balance again, it will give the older value
		double remBalance = this.balance +amt;
		System.out.println(this.owner +" "+ "- Your latest balance is " +  " "+ remBalance);
		
	}
	
	

}
