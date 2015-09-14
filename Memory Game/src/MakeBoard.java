import java.util.ArrayList;
import java.util.Collections;
public class MakeBoard
	{
	static String spaces[][];
		public static void genBoard()
			{
				String spaces[][]= new String[4][4];
				for(int i=0;i<spaces.length;i++)
					{
						for(int m=0;m<spaces[0].length;m++)
							{
								spaces[i][m]="   ";
							}
					}
			}
		public static void displayBoard()
			{
				System.out.println("    1      2      3      4    ");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("A| "+spaces[0][0]+" | "+spaces[0][1]+" | "+spaces[0][2]+" | "+spaces[0][3]+" |");
				System.out.println(" ------ ------ ------ ------ ");
				System.out.println("B| "+spaces[1][0]+" | "+spaces[1][1]+" | "+spaces[1][2]+" | "+spaces[1][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("C| "+spaces[2][0]+" | "+spaces[2][1]+" | "+spaces[2][2]+" | "+spaces[2][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("D| "+spaces[3][0]+" | "+spaces[3][1]+" | "+spaces[3][2]+" | "+spaces[3][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
			}
		public static void fillBoard()
			{
				ArrayList <String> boardSpaces = new ArrayList<String>();
				boardSpaces.add("dog");
				boardSpaces.add("elk");
				boardSpaces.add("cat");
				boardSpaces.add("rat");
				boardSpaces.add("owl");
				boardSpaces.add("dog");
				boardSpaces.add("bee");
				boardSpaces.add("cow");
				boardSpaces.add("dog");
				boardSpaces.add("elk");
				boardSpaces.add("cat");
				boardSpaces.add("rat");
				boardSpaces.add("owl");
				boardSpaces.add("dog");
				boardSpaces.add("bee");
				boardSpaces.add("cow");
				int counter= 0;
				for(int o=0;o<boardSpaces.size();o++)
					{
						for(int p=0;p<boardSpaces.size();p++)
							{
							spaces[o][p]=boardSpaces.get(counter);
							counter++;
							}
					}
				Collections.shuffle(boardSpaces);
			}
	}