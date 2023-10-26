package Ex2;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // circular => no foreach possible => bad idea :(
        return true;
    }

    @Override
    public String next() {
        return tv.channelUp();
    }
}
