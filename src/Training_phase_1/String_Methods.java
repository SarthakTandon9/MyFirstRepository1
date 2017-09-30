package Training_phase_1;

public class String_Methods {

	public static void main(String[] args) {
    String bookName = "Harry Potter";
    String word = "Harry";
    if(bookName.contains(word)) {
    	System.out.println("The book might be Harry Potter");
    	
    }
      String webBrowser = "Internet Explorer";
      if(webBrowser.equalsIgnoreCase("internet explorer")) {
    	  System.out.println("This will work");
    	  
      }
      
      String name1 = "Sarthak";
      String name2 = "Tandon";
      String security = "12896327232332323232";
      System.out.println(security.length());
      
      System.out.print(name1.substring(2,4));
      System.out.print(name2.substring(3, 4));
      System.out.print(security.substring(8, 13));
      System.out.print(" this is your security code to access internal files");
     

	}

}
