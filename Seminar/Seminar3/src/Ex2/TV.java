package Ex2;

import java.util.Iterator;
import java.util.List;

public class TV implements Iterable<String> {
    private List<String> channels;
    private String brand;
    private int index;
    private Remote remote;

    public TV(List<String> channels, String brand) {
        this.channels = channels;
        this.brand = brand;
        this.index = 0;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TV{" +
                "current channel=" + channels.get(index) +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String channelUp() {
        index++;
        if (index > channels.size() - 1) {
            index = 0;
        }
        return channels.get(index);
    }

    public String channelDown() {
        index--;
        if (index < 0) {
            index = channels.size() - 1;
        }
        return channels.get(index);
    }

    @Override
    public Iterator<String> iterator() {
        return remote;
    }
}
