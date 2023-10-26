package Ex2;

public class RemoteFactory {
    public Remote createRemote(String type, TV tv) {
        if (type.equals("basic")) {
            return new Remote(tv);
        }
        if (type.equals("smart")) {
            return new SmartRemote(tv);
        }
        return null;
    }
}
