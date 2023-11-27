package put.io.patterns.implement;

public class SystemCoolerObserver implements SystemStateObserver{

    SystemState lastSystemState;
    public void IncreaseCooler(){
        // Increase CPU cooling if the temperature is too high
        if (this.lastSystemState.getCpuTemp() > 60.00){
            System.out.println("> Increasing cooling of the CPU...");
        }
    }

    public void update(SystemMonitor monitor){
        this.lastSystemState = monitor.getLastSystemState();
        IncreaseCooler();
    }

}
