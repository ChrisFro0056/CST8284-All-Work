package lab01;

/*	
* 	Name			Christopher Frosst
* 	Student Num 	041121594
* 	Course Name 	Computer Programming (Java)
* 	Lab Section 	301
*/

	/**
   		This file is a tester for the ButtonCounter class. It tests the click, undo, and getValue methods.
   		@see ButtonCounterTester
	 */
public class ButtonCounterTester
{
    /**
		This method tests the click, undo, and getValue methods of the ButtonCounter class.
		@param args not used
    */
  public static void main(String[] args)
  {
     ButtonCounter tally = new ButtonCounter();
     tally.click();
     tally.click();
     tally.click();
     System.out.println(tally.getValue());
     System.out.println("Expected: 9");
     tally.undo();
     System.out.println(tally.getValue());
     System.out.println("Expected: 6");
     tally.undo();
     tally.undo();
     tally.undo();
     System.out.println(tally.getValue());
     System.out.println("Expected: 0");
  }
}