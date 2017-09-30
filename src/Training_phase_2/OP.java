package Training_phase_2;

public class OP {
  public static void main(String [] args) {
	  double i = 2000;
	  
	  oo1 acc = new oo1("Savings Account", 3829.883);
	  acc.setName("Roger Hue");
	  acc.setRate();
	  acc.increaseRate();
	  System.out.println(acc.getName());
	  acc.accountNumber = "839038";
	  acc.setSsn("656154");
	  System.out.println(acc.getSsn());
	  
	  acc.deposit(9029380);
	  acc.withdraw(3829.383);
	  
	  acc.toString();
  }
}


