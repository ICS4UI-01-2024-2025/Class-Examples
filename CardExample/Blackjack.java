import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create the things for the game
        DeckOfCards deck = new DeckOfCards();
        Player player = new Player("Player");
        Player dealer = new Player("Dealer");

        // shuffle the deck
        deck.shuffle();
        // deal 2 cards to player face up
        player.addCard(deck.drawCard(true));
        player.addCard(deck.drawCard(true));
        // deal 1 face up and 1 face down for the dealer
        dealer.addCard(deck.drawCard(true));
        dealer.addCard(deck.drawCard(false));

        // show the players
        System.out.println(player);
        System.out.println(dealer);

        // ask the player what they want to do
        String answer = "hit";
        while(answer.equals("hit")){
            System.out.println("hit or stay?");
            answer = input.nextLine();
            if(answer.equals("hit")){
                player.addCard(deck.drawCard(true));
                System.out.println(player);
            }
        }
        // make sure dealer has all face up cards
        dealer.flipAllCards();
        System.out.println(dealer);
        while(dealer.getTotal() <= 16){
            System.out.println("Dealer takes a card");
            dealer.addCard(deck.drawCard(true));
            System.out.println(dealer);
        }

        // print out hands one last time
        System.out.println(player);
        System.out.println(dealer);
        // who won?
        if(player.getTotal() > 21){
            System.out.println("Player busts and has lost!");
        }else if(dealer.getTotal() > 21){
            System.out.println("Dealer busts! Player wins!");
        }else if(player.getTotal() > dealer.getTotal()){
            System.out.println("Player wins");
        }else if(dealer.getTotal() > player.getTotal()){
            System.out.println("Dealer wins!");
        }else{
            System.out.println("Tie Game!");
        }


    }
}
