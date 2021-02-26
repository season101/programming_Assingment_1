public class SlideOrJump {
    int[] board;
    String move;

    public SlideOrJump(int[] board){
        this.board = board;
        move = "";
    }

    public long totalCost(int index){
        if(index == board.length-1){
            return board[board.length-1];
        }
        else if(index == board.length-2){
            return board[board.length - 2]+board[board.length-1];
        }
        return board[index]+Math.min(totalCost(index+1),totalCost(index+2));
    }

    public long recSolution(){
       
        return totalCost(1);

    }

    public long dpSolution(){
        return (long) 0.0;
    }

    public String getMoves(){
        return move;
    }

}
