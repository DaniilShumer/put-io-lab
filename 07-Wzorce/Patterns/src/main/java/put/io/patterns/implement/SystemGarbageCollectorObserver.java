package put.io.patterns.implement;

public class SystemGarbageCollectorObserver implements SystemStateObserver{

    SystemState lastSystemState;
    public void GarbageCollector(){
        // Run garbage collector when out of memory
        if (this.lastSystemState.getAvailableMemory() < 200.00){
            System.out.println("> Running garbage collector...");
        }
    }

    public void update(SystemMonitor monitor){
        this.lastSystemState = monitor.getLastSystemState();
        GarbageCollector();
    }

}
