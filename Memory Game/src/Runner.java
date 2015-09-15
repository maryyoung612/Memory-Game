
public class Runner
	{
		public static void main(String[] args)
			{
				MakeBoard.genBoard();
				MakeBoard.displayBoard();
				boolean running = true;
				while(running == true)
					{
					MakeBoard.fillBoard();
					PlayerMove.chooseSpace();
					MakeBoard.displayBoard();
					}
			}
	}