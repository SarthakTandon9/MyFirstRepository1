package Training_phase_1;

public class Functions {
public static void main(String[] args) {
	
	System.out.println("The programme is beggining");
	int a1 = 67;
	int a2 = 89;
	 String name1=  "Neha";
	 
	 double m1 = 42.0987;
	 double m2 = 982.0378;
	 name(name1);
	addNumbers( a1, a2);
	multiplyNumbers(m1, m2);
   }


    static void name(String namo) {
    	System.out.println("My name is " + namo);
    }

    
	static void addNumbers(double number1, double number2){
    	 double sum = number1 + number2;
    	 System.out.println("The sum of the numbers is " + sum);
     }
	
	static double multiplyNumbers(double multiplicant1, double multiplicant2) {
		double product = multiplicant1 * multiplicant2;
		System.out.println("The product of the 2 numbers is " + product);
		addNumbers(product + 50, product/89);
		return product;
	}
}
