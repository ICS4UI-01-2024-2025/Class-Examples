public class TestCards {
   public static void main(String[] args) {
       DeckOfCards deck = new DeckOfCards();
       deck.shuffle();
       Card card1 = deck.drawCard();
       Card card2 = deck.drawCard();
       Card card3 = deck.drawCard();
       System.out.println(card1);
       System.out.println(card2);
       System.out.println(card3);
   } 
}
