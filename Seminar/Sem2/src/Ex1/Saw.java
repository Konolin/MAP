package Ex1;

public class Saw extends Tool implements Cut {
    public Saw(String name, int weight) {
        super(name, weight);
    }

    // method 1
    @Override
    public boolean canCut() {
        return true;
    }

    // method 2
    @Override
    public void cut() {
        System.out.println("cutting....");
    }
}
