package lab02;

/*	
* 	Name			Christopher Frosst
* 	Student Num 	041121594
* 	Course Name 	Computer Programming (Java)
* 	Lab Section 	301
*/

/**
	This program prints a table of medal winner counts with row totals.
*	It will display Countries, how many medals they received and the total
*	from both the country and in total.
 * @see Medals
*/
public class Medals
{
    /** This method prints a table of medal counts.
     @param args not used */
   public static void main(String[] args) {
       // Number of countries and medals
       final int COUNTRIES = 8;
       final int MEDALS = 3;

       // Array of countries
       String[] countries =
               {
                       "Canada",
                       "Italy",
                       "Germany",
                       "Japan",
                       "Kazakhstan",
                       "Russia",
                       "South Korea",
                       "United States"
               };
        // Array of medal counts
       int[][] counts =
               {
                       {0, 3, 0},
                       {0, 0, 1},
                       {0, 0, 1},
                       {1, 0, 0},
                       {0, 0, 1},
                       {3, 1, 1},
                       {0, 1, 0},
                       {1, 0, 1}
               };

       //Prints header
       System.out.printf("        Country    Gold  Silver  Bronze   Total\n");

       // Print countries, counts, and row totals
       for (int i = 0; i < COUNTRIES; i++) {
           // Process the ith row
           System.out.printf("%15s", countries[i]);

           int total = 0;

           // Print each row element and update the row total
           for (int j = 0; j < MEDALS; j++) {
               System.out.printf("%8d", counts[i][j]);

               // Calculates the total medals for each row
               total = total + counts[i][j];

           }

           // Display the row total and print a new line
           System.out.printf("%8d\n", total);


       }

       // Array to hold column totals
       int[][] medalTotals = new int[4][1]; // 4 rows, 1 column

       // Print the header
       System.out.printf("    Medal Total");

       int grandTotal = 0;

       // print the column totals
       for (int j = 0; j < MEDALS; j++) {
           int total = 0;

           for (int i = 0; i < COUNTRIES; i++) {
               total = total + counts[i][j];
           }

           // Store the column total
           medalTotals[j][0] = total;
           // Update the grand total
           grandTotal += total;

           // Print the column total
           System.out.printf("%8d", total);
       }
       // Print the grand total
       System.out.printf("%8d\n", grandTotal);


   }
}

