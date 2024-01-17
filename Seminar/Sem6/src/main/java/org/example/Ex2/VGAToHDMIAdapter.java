package Seminar6.Ex2;

public class VGAToHDMIAdapter implements VGAPort {
    private HDMIPort hdmiPort;

    public VGAToHDMIAdapter(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    @Override
    public void connectVGA() {
        this.hdmiPort.connectHDMI();
    }
}
