// Working with more than one console
import hsa.Console;
public class OutputWithTwoConsoles
{
 public static void main (String [] args)
 {
 // Create a console with 15 rows and 30 columns
 Console firstConsole = new Console (15, 30, "First Console");
 firstConsole.println ("This is the first console");
 firstConsole.print ("No of Rows: ");
 firstConsole.println (firstConsole.getMaxRows ());
 firstConsole.print ("No of Columns: ");
 firstConsole.println (firstConsole.getMaxColumns ());
 firstConsole.println ("Press any key to continue");
 firstConsole.getChar ();
 // Create a console with 10 rows and 40 columns
 // All text in this console will use a 16-point font
 Console secondConsole = new Console (10, 40, 16, "Second Console");
 secondConsole.println ("This is the second console");
 secondConsole.print ("No of Rows: ");
 secondConsole.println (secondConsole.getMaxRows ());
 secondConsole.print ("No of Columns: ");
 secondConsole.println (secondConsole.getMaxColumns ());
 secondConsole.println ("Press any key to continue");
 secondConsole.getChar ();
 secondConsole.close ();
 firstConsole.println ("Back to the first console");
 firstConsole.println ("Program is complete");
 } // main method
} // OutputWithTwoConsoles class
