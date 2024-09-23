public class Player {
    private String name;
    private Card[] hand;
    private int numCards;

    public Player(String name){
        this.name = name;
        this.hand = new Card[10];
        this.numCards = 0;
    }

    public void addCard(Card c){
        // put card in the hand
        this.hand[this.numCards] = c;
        // increase the card count
        this.numCards++;
    }

    // figure out the total value of the hand
    public int getTotal(){
        // start off at 0
        int total = 0;
        // ace counter
        int aces = 0;
        // go through each card
        for(int i = 0; i < this.numCards; i++){
            // take a card
            Card c = this.hand[i];
            // if it is face up we can add it
            if(c.isFaceUp()){
                // all face cards are 10
                if(c.getRank() >= 11 && c.getRank() <=13){
                    total += 10;
                }
                // aces are weird - add 11
                else if(c.getRank() == 1){
                    total += 11;
                    // count 1 ace in case we go over
                    aces++;
                }
                // all other cards are their value
                else{
                    total += c.getRank();
                }
            }

        }
        // if we are over 21 and have aces to change
        while(total > 21 && aces > 0){
            // subtract 10 to turn 11 into 1
            total -= 10;
            // get rid of an ace
            aces--;
        }

        return total;
    }

    public void resetHand(){
        this.numCards = 0;
        this.hand = new Card[10];
    }

    public void flipAllCards(){
        for(int i = 0; i < this.numCards; i++){
            Card c = this.hand[i];
            // if it isn't face up
            if(!c.isFaceUp()){
                // flip it over
                c.flip();
            }
        }
    }

    public String toString(){
        String output = this.name + " - " + this.getTotal() + "\n";
        // go through each card
        for(int i = 0; i < this.numCards; i++){
            Card c = this.hand[i];
            if(c.isFaceUp()){
                output += c;
            }else{
                output += "A CARD";
            }
            output += "\n";
        }
        return output;
    }


}
