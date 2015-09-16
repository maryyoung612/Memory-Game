import java.util.Scanner;
public class PlayerMove
	{
		static int choice;
		static String rowChoice;
		static String save;
		static String savedChoice;
		static String savedChoice2;
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
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1,2))-1;
								MakeBoard.space[0][choice]= MakeBoard.words[0][choice];
								PlayerMove.save= "0"+ PlayerMove.rowChoice.substring(1,2);
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("b"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1,2))-1;
								MakeBoard.space[1][choice]= MakeBoard.words[1][choice];
								PlayerMove.save= "1"+ PlayerMove.rowChoice.substring(1,2);
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("c"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1,2))-1;
								MakeBoard.space[2][choice]= MakeBoard.words[2][choice];
								PlayerMove.save= "2"+ PlayerMove.rowChoice.substring(1,2);
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("d"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1,2))-1;
								MakeBoard.space[3][choice]= MakeBoard.words[3][choice];
								PlayerMove.save= "3"+ PlayerMove.rowChoice.substring(1,2);;
								rowChoice=true;
							}
					}
			}
		public static void check() throws InterruptedException
		{
			if(MakeBoard.space[Integer.parseInt(PlayerMove.savedChoice.substring(0,1))][Integer.parseInt(PlayerMove.savedChoice.substring(1,2))-1].contains(
					
			MakeBoard.space[Integer.parseInt(PlayerMove.savedChoice2.substring(0,1))][Integer.parseInt(PlayerMove.savedChoice2.substring(1,2))-1]))
				{
					System.out.println("They match!");
				}
			else
				{
					System.out.println("They do not match!");
					MakeBoard.space[Integer.parseInt(PlayerMove.savedChoice.substring(0,1))][Integer.parseInt(PlayerMove.savedChoice.substring(1,2))-1]="   ";
					MakeBoard.space[Integer.parseInt(PlayerMove.savedChoice2.substring(0,1))][Integer.parseInt(PlayerMove.savedChoice2.substring(1,2))-1]="   ";
					Thread.sleep(2000);
				}
		}
	}