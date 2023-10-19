import java.util.Iterator;

public class DeckIterator implements Iterator<Card> {
    private int index;
    private Deck deck;

    public DeckIterator(Deck deck) {
        this.index = 0;
        this.deck = deck;
    }

    @Override
    public boolean hasNext() {
        return index < deck.getSize();
    }

    @Override
    public Card next() {
        if (hasNext()) {
            return deck.getCards().get(index++);
        }
        throw new IndexOutOfBoundsException();
    }
}
