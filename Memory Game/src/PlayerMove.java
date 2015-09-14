import java.util.Scanner;
public class PlayerMove
	{
		static String userChoice;
		static int columnChoice;
		public static void Choose()
			{
				System.out.println("Please input the cordinates for your guess");
			}
		public static void checkMatch()
			{
				Scanner userInput= new Scanner(System.in);
				PlayerMove.userChoice = userInput.nextLine();
				boolean userChoice=false;
				while(userChoice==false)
					{
						if((PlayerMove.userChoice.length()<=1)||(PlayerMove.userChoice.length()>=3))
							{
							System.out.println("You need to enter in cordinates");
							}
						else if(PlayerMove.userChoice.toLowerCase().equals("a"))
							{
								columnChoice=Integer.parseInt(PlayerMove.userChoice.substring(1))-1;
								MakeBoard.spaces[1][columnChoice]= ;
							}
						else if(PlayerMove.userChoice.toLowerCase().equals("b"))
							{
								columnChoice=Integer.parseInt(PlayerMove.userChoice.substring(1))-1;
								MakeBoard.spaces[1][columnChoice]= ;
							}
						else if(PlayerMove.userChoice.toLowerCase().equals("c"))
							{
								columnChoice=Integer.parseInt(PlayerMove.userChoice.substring(1))-1;
								MakeBoard.spaces[1][columnChoice]= ;
							}
						else if(PlayerMove.userChoice.toLowerCase().equals("d"))
							{
								columnChoice=Integer.parseInt(PlayerMove.userChoice.substring(1))-1;
								MakeBoard.spaces[1][columnChoice]= ;
							}
					}
			}
	}