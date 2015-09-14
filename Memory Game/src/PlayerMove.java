import java.util.Scanner;
public class PlayerMove
	{
		static String userChoice;
		static int columnChoice;
		public static void Choose()
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Please input the cordinates for your guess");
				userChoice = userInput.nextLine();
				columnChoice=Integer.parseInt(userChoice.substring(1))-1;
			}
	}