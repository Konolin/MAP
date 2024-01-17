package Seminar6.Ex2;

public class Main {
    public static void main(String[] args) {
        VGAMonitor vgaMonitor = new VGAMonitor();
        Computer computer1 = new Computer(vgaMonitor);
        computer1.display();

        HDMIMonitor hdmiMonitor = new HDMIMonitor();
        VGAToHDMIAdapter vgaToHDMIAdapter = new VGAToHDMIAdapter(hdmiMonitor);
        Computer computer2 = new Computer(vgaToHDMIAdapter);
        computer2.display();
    }
}
