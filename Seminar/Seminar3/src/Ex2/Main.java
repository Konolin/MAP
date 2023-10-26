package Ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(List.of("Digi sport 1", "Antena3", "KanalD"), "Samsung");

        RemoteFactory rf = new RemoteFactory();
        Remote basic = rf.createRemote("basic", tv);
        tv.setRemote(basic);

        tv.channelUp();
        tv.channelUp();

        Remote smart = rf.createRemote("smart", tv);
        tv.setRemote(smart);

        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        Remote remote = (Remote) tv.iterator();

        remote.next();
        remote.next();
        remote.next();
        remote.next();

        System.out.println(tv);
    }
}
