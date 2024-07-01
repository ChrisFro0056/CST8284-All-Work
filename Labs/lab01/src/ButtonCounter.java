package lab01;

/*	
* 	Name			Christopher Frosst
* 	Student Num 	041121594
* 	Course Name 	Computer Programming (Java)
* 	Lab Section 	301
*/


	/** This class is a counter that takes in a value and outputs it into the ButtonCounterTester class.
    @see ButtonCounter */
public class ButtonCounter
{
   private int value;

	
   /** This method gets the current value of the counter and returns it.
    @return the current value of the counter */
   public int getValue()
   {
return value;
   }


   /** This method increments the current value of the counter by 3. */
   public void click()
   {
      value += 3;
   }

   /** This method resets the value of the counter to 0 and prints a message accordingly */
   public void reset()
   {
      value = 0;
      System.out.println("The counter has been reset.");
   }


   /** This method undoes a click, but will not drop below 0. Otherwise, it will output a message indication the counter cannot go below 0.*/
   public void undo()
   {
      value -= 3;
      if (value < 0)
      {
         value = 0;
         System.out.println("The counter cannot go below 0.");
      }
   }
}
