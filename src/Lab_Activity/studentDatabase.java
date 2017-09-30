package Lab_Activity;

public class studentDatabase {
  public static void main(String[]args) {
	  studentDatabaseApp st1 = new studentDatabaseApp("Sarthak"," 892928");
	  st1.enroll();
	  st1.pay(2653651652.65);
	  st1.showCourses("Tests course");
	  st1.checkBalance();
	  st1.toString();
	  st1.setPhoneNumber("7718048622");
	  st1.setCity("Mumbai");
	  st1.setState("Maharashtra");
	  st1.setCountry("India");
	  System.out.println("Phone Number: " + st1.getPhoneNumber());
	  System.out.println("City: " + st1.getCity());
	  System.out.println("State: " + st1.getState());
	  System.out.println("Country: " + st1.getCountry());
	  
  }
}


class studentDatabaseApp{
	
	private String id = "@test.com";
	String name = null;	
	private static String ID;
	private static String ssn;
	 private static String userID;
	 private static double balance;
	 private String phoneNumber;
	 private String city;
	 private String state;
	 private String country;
	
	
	studentDatabaseApp(String name , String ssn){
		System.out.println("Your new account created");
		System.out.println("Your name is: " + name);
		System.out.println("Your ssn is: " + ssn);
		String id = name + this.id;
		System.out.println("Your id is: " +id);
		ID = id;
		
		
		
		
	}
	
	private static String user() {
		userID = ID + (Math.random()*10000) + ssn.substring(2);
		System.out.println(userID);
		return userID;
	}
	
	public static void enroll() {
		System.out.println("Congratultions! You have been enrolled");
		activity("Enrollment");
	}
	
	public static void pay(double amount) {
		balance = balance + amount;
		System.out.println("You just paid $ " + amount );
		activity ("Paymment");
		
	}
	
	private static void activity(String activity) {
		System.out.println("Your recent activity was " + activity);
		System.out.println("Your balance is: " + balance);
	}
	
	public static void checkBalance() {
		
		System.out.println("Your balance is: " + balance);
	}
	@Override
	public String toString() {
		return "[ Balance: " + balance + "]\n";
	}
	
	public static void showCourses(String Courses) {
		System.out.println("Your courses are: " + Courses);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	
	
	
	
}