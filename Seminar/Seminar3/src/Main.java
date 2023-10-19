import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card(Color.DIAMONDS, "A"));
        cards.add(new Card(Color.HEARTS, "10"));
        cards.add(new Card(Color.SPADES, "K"));
        cards.add(new Card(Color.CLUBS, "4"));

        Deck deck = new Deck(cards);

        for (int i = 0; i < deck.getSize(); i++) {
            System.out.println(deck.getCards().get(i));
        }

//        DeckIterator deckIterator = new DeckIterator(deck);
        for(Card card : deck) {
            System.out.println(card);
        }
    }
}