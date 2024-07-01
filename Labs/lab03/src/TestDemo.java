
package lab03;

/*
 * 	Name			Christopher Frosst
 * 	Student Num 	041121594
 * 	Course Name 	Computer Programming (Java)
 * 	Lab Section 	301
 */

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Christopher Frosst
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */

	/*
	 * 	Name			Christopher Frosst
	 * 	Student Num 	041121594
	 * 	Course Name 	Computer Programming (Java)
	 * 	Lab Section 	301
	 */
	
	public static void main(String[] args) {


		System.out.println("Just creating 4 EventSchedules\n");

		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());

		System.out.println("\nEventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());

		System.out.println("\nEventSchedule3");
		System.out.println(new EventSchedule(2023, 12).createReport());

		System.out.println("\nEventSchedule4");
		System.out.println(new EventSchedule(2023, 12, 15).createReport());
	}

}
