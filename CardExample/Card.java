/**
 * Card
 */
public class Card {
    // instance variables
    // class variables
    // fields
    private String suit;
    private int rank;
    private boolean isFaceUp;

    // construtor method
    // - initialize all the variables
    // pre: suit = "Clubs", "Hearts", "diamons", "Spades"
    // pre: 1 <= rank <= 13 
    public Card(String suit, int rank) {
        this.isFaceUp = false;
        this.suit = suit;
        this.rank = rank;
       
    }
    
    // mutator method / setter
    // - modifies an instance variable
    public void flip(){
        this.isFaceUp = !this.isFaceUp;
    }

    // accessor methods / getters
    // - get info from instance variables
    public String getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    public boolean isFaceUp(){
        return this.isFaceUp;
    }

    @Override
    public String toString(){
        String cardName = "";
        if(this.rank == 1){
            cardName += "Ace";
        }else if(this.rank == 11){
            cardName += "Jack";
        }else if(this.rank == 12){
            cardName += "Queen";
        }else if(this.rank == 13){
            cardName += "King";
        }else{
            cardName += this.rank;
        }

        cardName += " of " + this.suit;
        return cardName;
    }

    

    
}