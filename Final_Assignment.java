import java.util.Scanner;
import java.util.regex.Pattern;
public class Final_Assignment {public static void main(String[] args) 
{
	Scanner input = new Scanner(Final_Assignment.class.getResourceAsStream("input.dat"));
  //String fileContents = " ";
	
while(input.hasNextLine())
	{
	String line = input.nextLine();
	//String s = input.nextLine();
	
	if(line.contains("<"))
	{
		line = line.replaceAll("<", "");
		line = line.replaceAll(">", "->");
		 String[] run = line.split("/");
		 
		 line= run[0];
	}

//	String s1 = input.nextLine();
	
	
	System.out.println(line);
	}
}

}
