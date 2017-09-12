import hsa.Console;

import java.awt.Color;

public class ConsoleOutput
{
 public static void main (String [] args)
 {
 Console myConsole = new Console ("First Java Program");
 myConsole.setTextBackgroundColor(Color.BLUE); 
 myConsole.clear();
 myConsole.setTextColor(Color.GREEN); 
 myConsole.setCursor (3, 10);
 myConsole.println ("Welcome to Java");
 }
}
