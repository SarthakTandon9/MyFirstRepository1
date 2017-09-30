package Training_phase_2;

public class oo1 implements Bank {
  String accountNumber;
  private static final String routNumber = "33432";
  private String name;
  private String ssn;
  String accountType;
  double balance = 0;
 
  
  oo1(String accountType, double initialDeposit){
	  System.out.println("New Account created");
	  System.out.println("This account is a: " + accountType);
	  System.out.println("Your initial deposit is: " + initialDeposit);
	  balance = balance + initialDeposit;
	  System.out.println("Balance: " + balance);
  }
  
 
  
  
  
 
  void deposit(double amount ) {
	  balance = balance + amount;
	  activity("Deposited ");
  }
  

  
  
  void withdraw(double amount) {
	  balance = balance - amount;
	  activity("Withdraw ");
  }
  
  
  
  private void activity(String activity) {
	 System.out.println("Your recent activity was: " + activity);
	 System.out.println("Your balance is: " + balance);
  }
  @Override
  
  
  
  public String toString() {
	  System.out.println( "[" + name + ", " + ssn +", " + accountNumber+ "]");
	  return "[" + name + ", " + ssn +", " + accountNumber+ "]";
  }
  
  
  
  
  
  public void setName(String name) {
	  this.name ="Mr." + name;
  }
  
 
  
  
  
  public String getName() {
	  return name;
  }
  
  
  public String getSsn() {
	return ssn;
}





public void setSsn(String ssn) {
	this.ssn = ssn;
}
//interface methods

public void setRate() {
	System.out.println("Setting rate");
	
}

public void increaseRate() {
	System.out.println("Increasing rate");
}





void getStatus() {
	  
  }
  
 void checkBalance() {
	 
 }
}