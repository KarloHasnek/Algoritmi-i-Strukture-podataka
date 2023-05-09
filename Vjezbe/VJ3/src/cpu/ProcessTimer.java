package cpu;

public class ProcessTimer {

    private int processID;
    private static int cntID = 10;
    private long processDuration;
    private long processingTime;
    private String processName;

    public ProcessTimer(String name, long processDuration){

        this.processName = name;
        this.processID = cntID++;
        this.processDuration = processDuration;
        this.processingTime = 0;
        System.out.println("Created process");

    }

    public void setProcessDuration(long processDuration) {
        this.processDuration = processDuration;
    }

    public int getProcessID() {
        return processID;
    }

    public String getProcessName() {
        return processName;
    }

    public boolean isFinished() {
        return processingTime >= processDuration;
    }

    public boolean processingStep(long timeElapsed) {
        processingTime += timeElapsed;
        return processingTime < processDuration;
    }

    @Override
    public String toString() {
        return "[Duration=" + processDuration + ", processingTime="
                + processingTime + ", Name=" + processName + "]";
    }
}

