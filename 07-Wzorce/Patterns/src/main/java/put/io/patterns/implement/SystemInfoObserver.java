package put.io.patterns.implement;

public class SystemInfoObserver implements  SystemStateObserver{

    SystemState lastSystemState;

    public void PrintMonitor(){
        // Print information to the console
        System.out.println("============================================");
        System.out.println(String.format("CPU Load: %2.2f%%", this.lastSystemState.getCpu()));
        System.out.println(String.format("CPU temperature: %.2f C", this.lastSystemState.getCpuTemp()));
        System.out.println(String.format("Available memory: %.2f MB", this.lastSystemState.getAvailableMemory()));
        System.out.println(String.format("USB devices: %d", this.lastSystemState.getUsbDevices()));

    }

    public void update(SystemMonitor monitor){
        this.lastSystemState = monitor.getLastSystemState();
        PrintMonitor();
    }

}
