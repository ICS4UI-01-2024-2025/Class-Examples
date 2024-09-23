public class DeckOfCards {
    private Card[] cards;
    private int cardsLeft;

    // constructor for standard deck of 52
    public DeckOfCards(){
        this.cards = new Card[52];
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
        // for each suit
        for(int i = 0; i < 4; i++){
            String suit = suits[i];
            // go through each card
            for(int j = 1; j <= 13; j++){
                // make the card
                Card c = new Card(suit, j);
                // store the card in the array
                this.cards[this.cardsLeft] = c;
                // increase the card count
                this.cardsLeft++;
            }
        }

    }

    public Card drawCard(boolean faceUp){
        // take the card that is on top
        Card c = this.cards[this.cardsLeft - 1];
        // decrease the card count
        this.cardsLeft--;
        // if it should be face up
        if(faceUp){
            c.flip();
        }
        // send the card over
        return c;
    }

    public void shuffle(){
        for(int i = 0; i < this.cardsLeft - 1; i++){
            // where is it swapping from
            int swapSpot = (int)(Math.random()*(this.cardsLeft - i - 1) + (i + 1));
            // get the 2 cards to swap
            Card card1 = this.cards[i];
            Card card2 = this.cards[swapSpot];
            // swap them
            this.cards[i] = card2;
            this.cards[swapSpot] = card1;
        }
    }

}
