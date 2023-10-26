package Ex2;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        return tv.channelUp();
    }
}
