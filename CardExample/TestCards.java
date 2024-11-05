public class TestCards {
   public static void main(String[] args) {
       DeckOfCards deck = new DeckOfCards();
       deck.shuffle();
       Card card1 = deck.drawCard(true);
       Card card2 = deck.drawCard(false);
       Card card3 = deck.drawCard(true);
       System.out.println(card1);
       System.out.println(card2);
       System.out.println(card3);
   } 
}
