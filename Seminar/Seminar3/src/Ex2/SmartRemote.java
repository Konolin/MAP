package Ex2;

public class SmartRemote extends Remote {
    public SmartRemote(TV tv) {
        super(tv);
    }

    @Override
    public String next() {
        System.out.println("Woaaaaaah");
        return tv.channelUp();
    }
}
