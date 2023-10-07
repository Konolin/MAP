package Ex4.Main;

public class Ex4Main {
    public static void main(String[] args) {
        int[] keyboards = new int[]{40, 50, 60};
        int[] usb = new int[]{8, 12};

        ElectronicsShop es = new ElectronicsShop();
        System.out.println(es.cheapestItem(keyboards));

        System.out.println(es.mostExpensiveItem(keyboards));
        System.out.println(es.mostExpensiveItem(usb));

        System.out.println(es.mostExpensiveAndAffordableItem(usb, 10));

        System.out.println(es.bestCombinationPrice(keyboards, usb, 60));
    }
}
