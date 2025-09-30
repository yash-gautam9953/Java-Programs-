class BankAcc{
	
	String accHolderName;
	String accNo;
	double balance;

	BankAcc(){
		accHolderName = "";
		accNo = "";
		balance =0;
	}

	BankAcc(String ahn,String acn,double b){
		accHolderName=ahn;
		accNo=acn;
		balance=b;
	}

	void deposit(double amt){
		
		balance = balance + amt;
		System.out.println( amt +" deposit success ....");

	}

	void withdrawl(double amt){

		balance = balance - amt;
		System.out.println( amt +" withdrawl success ....");
	}

	void checkBalance(){

		System.out.println( "Balance : " + balance);
	}

}

class TestBankAcc{

	public static void main(String[] args){

		System.out.println();

		BankAcc user1 = new BankAcc("Yash Gautam","12345678",100000);
		user1.deposit(10000);
		System.out.println();
		user1.withdrawl(100000);
		System.out.println();
		user1.checkBalance();
		System.out.println();

	}
}