package Ex1;

import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card> {
    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public DeckIterator iterator() {
        return new DeckIterator(this);
    }
}
