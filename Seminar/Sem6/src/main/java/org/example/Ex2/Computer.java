package Seminar6.Ex2;

public class Computer {
    private final VGAPort vgaPort;

    public Computer(VGAPort vgaPort) {
        this.vgaPort = vgaPort;
    }

    public void display() {
        vgaPort.connectVGA();
    }
}
