import java.util.ArrayList;

public class EightQueens {

    public boolean placeQueens(int n, ArrayList<Queen> queens) {
        // found a solution
        if (queens.size() == n) {
            return true;
        }
        // find a safe spot on the board
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (isSafe(row, col, queens)) {
                    // make the queen at this spot
                    Queen q = new Queen(row, col);
                    queens.add(q);
                    boolean answer = placeQueens(n, queens);
                    // did the answer fully work?
                    if (answer) {
                        return true;
                    } else {
                        // this spot didn't pan out
                        // remove the queen and keep trying
                        queens.remove(queens.size() - 1);
                    }
                }
            }
        }

        // wnet through all spots, and couldn't find one
        return false;

    }

    private boolean isSafe(int row, int col, ArrayList<Queen> queens) {
        // go through each queen
        for (int i = 0; i < queens.size(); i++) {
            Queen q1 = queens.get(i);
            // are they the same row or col
            if (q1.getRow() == row) {
                return false;
            } else if (q1.getCol() == col) {
                return false;
            }

            // check diagonals
            int rowDiff = Math.abs(q1.getRow() - row);
            int colDiff = Math.abs(q1.getCol() - col);
            if (rowDiff == colDiff) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        EightQueens test = new EightQueens();
        ArrayList<Queen> solution = new ArrayList<>();

        boolean found = test.placeQueens(15,solution);
        if(found){
            // print solution
            for (int i = 0; i < solution.size(); i++) {
                Queen q = solution.get(i);
                System.out.println(q.getRow() + ", " + q.getCol());
            }
        }
    }
}
