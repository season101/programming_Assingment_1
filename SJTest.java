import java.util.Arrays;

/** 
	Program to test the functionality of the SlideOrJump class.
*/
public class SJTest
{
	public static void main(String [] args)
	{   
		int [] test0 = {0, 5, 75, 7, 43, 11};
		int [] test1 = {0, 5};
		int [] test2 = {0, 5, 75};
		int [] test3 = {0, 5, 75, 7, 43, 11, 12, 45, 32, 21, 45, 21, 76, 43, 23, 42, 7, 5, 20};
    int [] test4 = {0,4,12,19,32,38,45,51,76,87,99,101,115,127,135,148,157,168,177,180,190,200,201,222,236,239,251,267,277,278};
		
		SlideOrJump board0 = new SlideOrJump(test0);
		SlideOrJump board1 = new SlideOrJump(test1);
		SlideOrJump board2 = new SlideOrJump(test2);
		SlideOrJump board3 = new SlideOrJump(test3);
 		SlideOrJump board4 = new SlideOrJump(test4);

		
		System.out.println("\nBoard: " + Arrays.toString(test0) + "\nRecursive Sol Cost: " + board0.recSolution()); 
		System.out.println("Dyn Prog Sol Cost:  " + board0.dpSolution() + "\nMoves: " + board0.getMoves());
		System.out.println("\nBoard: " + Arrays.toString(test1) + "\nRecursive Sol Cost: " + board1.recSolution()); 
		System.out.println("Dyn Prog Sol Cost:  " + board1.dpSolution() + "\nMoves: " + board1.getMoves());
		System.out.println("\nBoard: " + Arrays.toString(test2) + "\nRecursive Sol Cost: " + board2.recSolution()); 
		System.out.println("Dyn Prog Sol Cost:  " + board2.dpSolution() + "\nMoves: " + board2.getMoves());
		System.out.println("\nBoard: " + Arrays.toString(test3) + "\nRecursive Sol Cost: " + board3.recSolution()); 
		System.out.println("Dyn Prog Sol Cost:  " + board3.dpSolution() + "\nMoves: " + board3.getMoves());
    System.out.println("\nBoard: " + Arrays.toString(test4)); 
		System.out.println("Dyn Prog Sol Cost:  " + "\nMoves: " + board4.getMoves());
	
	}
}i