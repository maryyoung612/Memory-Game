import java.util.Scanner;
public class PlayerMove
	{
		static int choice;
		static String rowChoice;
		public static void chooseSpace()
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Please input the cordinates for your guess");
				rowChoice = userInput.nextLine();
				boolean rowChoice=false;
				while(rowChoice==false)
					{
						if((PlayerMove.rowChoice.length()<=1)||(PlayerMove.rowChoice.length()>=3))
							{
							System.out.println("You need to enter in cordinates");
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("a"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[0][choice]= MakeBoard.words[0][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("b"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[1][choice]=  MakeBoard.words[1][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("c"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[2][choice]=  MakeBoard.words[2][choice];
								rowChoice=true;
							}
						else if(PlayerMove.rowChoice.toLowerCase().contains("d"))
							{
								choice=Integer.parseInt(PlayerMove.rowChoice.substring(1))-1;
								MakeBoard.space[3][choice]=  MakeBoard.words[3][choice];
								rowChoice=true;
							}
					}
			}
	}