/**
* SlideOrJump Class is the model of game called Slide or Jump. The game starts with player standing on one end of 
* board and player has to reach the end of board with minimum cost required since every time player moves to the cell, * he owes the money. So the player has a choice to either slide to adjacent cell or to jump next cell of adjacent cell.
*
*@author Sijan Malla
*
*/
public class SlideOrJump {
  
  /*Declaring instance variables*/
    private int[] board;  // an array representation of cells of the game board
    private String move;  // Storage for the move that player chooses to move
                          
    /**
    * 
    */
    public SlideOrJump(int[] board){
        this.board = board;
        move = "";
    }

    public long totalCostDP(int index){

        long totalCost = 0;
        long[] storage = new long[board.length];

        for(int i=board.length-1;i>=0;i--) {
            if (index == board.length - 1) {
                storage[index] = board[index];
                totalCost = storage[index];
            }


            else if (index == board.length - 2) {
                storage[index] = board[index] + storage[index+1];
                totalCost = storage[index];
                if(board[index]<board[index+1]);
            }

            else {
                storage[index]= board[index]+Math.min(storage[index+1], storage[index+2]);
                totalCost=storage[index];
            }
            index--;
        }
        if(board.length == 2){
            move="S";
            return totalCost;
        }

        for(int i=0; i<storage.length-2;i++){

            if(storage[i+1]<=storage[i+2]) move+="S";
            else {
                move += "J";
                i++;
            }
        }

        return totalCost;

    }

    public long totalCostREC(int index){
        if(index == board.length-1){
            return board[board.length-1];
        }
        else if(index == board.length-2){
            return board[board.length - 2]+board[board.length-1];
        }
        return board[index]+Math.min(totalCostREC(index+1),totalCostREC(index+2));
    }

    public long recSolution(){

        return totalCostREC(0);

    }

    public long dpSolution(){
        return totalCostDP(board.length-1);
    }

    public String getMoves(){
      if(move.equals("")){
        totalCostDP(board.length-1);
      }
        return move;
    }

}
