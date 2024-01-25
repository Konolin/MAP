package Ex1;

public class Saw extends Tool implements Cut {
    public Saw(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void cut() {
        System.out.println("cutting....");
    }
}
