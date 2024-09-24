
/** This class manages the interactions between the different pieces of
 *  the game: the Board, the Daleks, and the Doctor. It determines when
 *  the game is over and whether the Doctor won or lost.
 */
public class CatchGame {

    /**
     * Instance variables go up here
     * Make sure to create a Board, 3 Daleks, and a Doctor
     */
    private Board grid;


    /**
     * The constructor for the game.
     * Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame(){
        this.grid = new Board(12,12);
    }

    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {
        // display a message on the board
        this.grid.displayMessage("Click the board");
        // putting down a peg
        this.grid.putPeg(Board.RED,1,3);
        // click on the board
        while(true){
            Coordinate click = this.grid.getClick();
            // do something where you click
            this.grid.putPeg(Board.YELLOW,click.getRow(), click.getCol());
            // remove a peg
            this.grid.removePeg(1,3);
        }
    }
        

}
