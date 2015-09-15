import java.util.Scanner;
public class PlayerMove
	{
		static int choice;
		static String rowChoice;
		static String savedChoice;
		public static void chooseSpace()
			{
				System.out.println("Please input the cordinates for your guess");
				boolean rowChoice=false;
				while(rowChoice==false)
					{
						Scanner userInput= new Scanner(System.in);
						PlayerMove.rowChoice = userInput.nextLine();
						if((PlayerMove.rowChoice.length()<=1)||(PlayerMove.rowChoice.length()>=3))
							{
							System.out.println("You need to enter in cordinates");
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("a"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[0][choice]= MakeBoard.words[0][choice];
								PlayerMove.savedChoice= MakeBoard.space[0][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("b"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[1][choice]= MakeBoard.words[1][choice];
								PlayerMove.savedChoice= MakeBoard.space[1][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("c"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[2][choice]= MakeBoard.words[2][choice];
								PlayerMove.savedChoice= MakeBoard.space[2][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("d"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[3][choice]= MakeBoard.words[3][choice];
								PlayerMove.savedChoice= MakeBoard.space[3][choice];
								rowChoice=true;
							}
					}
			}
		public static void check() throws InterruptedException
		{
			if(PlayerMove.savedChoice.equals(PlayerMove.savedChoice))
				{
					PlayerMove.savedChoice = MakeBoard.space[0][PlayerMove.choice];
					System.out.println("They match!");
				}
			else
				{
					System.out.println("They do not match!");
					Thread.sleep(2000);
					choice=Integer.parseInt(PlayerMove.rowChoice.substring(1,2))-1)="   ";
				}
		}
	}