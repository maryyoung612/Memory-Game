import java.util.ArrayList;
import java.util.Collections;
public class MakeBoard
	{
		static String words[][]= new String[4][4];
		static String space[][]= new String[4][4];
		public static void genBoard()
			{
				
				for(int i=0;i<words.length;i++)
					{
						for(int m=0;m<words[0].length;m++)
							{
								words[i][m]="   ";
							}
					}
				for(int j=0;j<space.length;j++)
					{
						for(int k=0;k<space[0].length;k++)
							{
								space[j][k]="   ";
							}
					}
			}
		public static void displayBoard()
			{
				System.out.println("    1      2      3      4    ");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("A | "+space[0][0]+" | "+space[0][1]+"  | "+space[0][2]+"  | "+space[0][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("B | "+space[1][0]+" | "+space[1][1]+"  | "+space[1][2]+"  | "+space[1][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("C | "+space[2][0]+" | "+space[2][1]+"  | "+space[2][2]+"  | "+space[2][3]+" |");
				System.out.println("  ------ ------ ------ ------ ");
				System.out.println("D | "+space[3][0]+" | "+space[3][1]+"  | "+space[3][2]+"  | "+space[3][3]+" |");
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
				for(int o=0;o<words.length;o++)
					{
						for(int p=0;p<words[0][0].length();p++)
							{
							words[o][p]=boardSpaces.get(counter);
							counter++;
							}
					}
				Collections.shuffle(boardSpaces);
			}
	}