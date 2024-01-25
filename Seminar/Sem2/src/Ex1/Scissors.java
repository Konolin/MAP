package Ex1;

public class Scissors extends Tool implements Cut {
    public Scissors(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void cut() {
        System.out.println("Cutting...");
    }
}
