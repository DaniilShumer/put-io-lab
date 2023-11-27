package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{

    SystemState lastSystemState;
    int old_usb;

    public void CheckUSB(){
        if (this.lastSystemState.getUsbDevices() != this.old_usb){
            System.out.println("> Number of USB devices has been changed!");
            this.old_usb = this.lastSystemState.getUsbDevices();
        }
    }

    public void update(SystemMonitor monitor){
        this.lastSystemState = monitor.getLastSystemState();
        CheckUSB();
    }

}
