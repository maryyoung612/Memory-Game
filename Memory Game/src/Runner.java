
public class Runner
	{
	static boolean ghost;
	static int counter;
		public static void main(String[] args) throws InterruptedException
			{
				
				MakeBoard.genBoard();
				MakeBoard.fillBoard();
				counter=0;
				boolean ghost = true;
				while(ghost == true)
					{
					MakeBoard.displayBoard();
					PlayerMove.chooseSpace();
					PlayerMove.savedChoice = PlayerMove.save;
					MakeBoard.displayBoard();
					PlayerMove.chooseSpace();
					PlayerMove.savedChoice2 = PlayerMove.save;
					counter++;
					MakeBoard.displayBoard();
					PlayerMove.check();
					checkForWun();
					}	
			}
		public static void checkForWun()
			{
			for(int i=0;i<MakeBoard.space.length;i++)
				{
					for(int m=0;m<MakeBoard.space[0].length;m++)
						{
						if(MakeBoard.space[i][m].equals("   "))
							{
							i = MakeBoard.space.length;
							m = MakeBoard.space[0].length;
							}
						if(i==MakeBoard.space.length -1 && m==MakeBoard.space[0].length -1)
							{
							System.out.println("Yay, you won the whole game!!!!! Congrats! You did it in "+counter+" tries");
							Runner.ghost=false;
							System.exit(0);
						}
					}
				}
			}
	}