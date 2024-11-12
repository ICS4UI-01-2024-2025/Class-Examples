public class Queen {
    private int row;
    private int col;

    public Queen(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public boolean canAttack(int row, int col){
        if(this.row == row){
            return true;
        }else if(this.col == col){
            return true;
        }
        int rowDiff = Math.abs(this.row - row);
        int colDiff = Math.abs(this.col - col);
        if(rowDiff == colDiff){
            return true;
        }

        return false;
    }
}
