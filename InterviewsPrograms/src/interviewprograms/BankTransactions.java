package interviewprograms;

public class BankTransactions {
	
	static int CurrentBal = 1000;
	
	public static void greetingCustomer() {
		System.out.println("WelCome to the Bank ");
	}
	
	public void deposit(int Amount) {
		CurrentBal = CurrentBal + Amount;
		System.out.println("Desposit SuccessFully");
	}
	public void Withdraw(int Amount){
		CurrentBal = CurrentBal-Amount;
		System.out.println("Withdraw SuccessFully");
	}
	
	public int Balance() {
		return  CurrentBal;
	}
	
	public static void main(String[] args) {
		greetingCustomer();
		
		BankTransactions bal = new BankTransactions();
		System.out.println("Availble Bal:- " + bal.Balance());
		
		bal.deposit(122);
		System.out.println("Availble Bal:- " + bal.Balance());

		bal.Withdraw(2);
		System.out.println("Availble Bal:- " + bal.Balance());

	}
	
	
	
}
