package cpu;

import clist.CLL;

public class TestProcessTimer {

    private static CLL<ProcessTimer> cllList;
    public static void main(String[] args) {
        
        cllList = new CLL<>();
        System.out.println(cllList);

        ProcessTimer p1 = new ProcessTimer("Process-01", 1000);
        ProcessTimer p2 = new ProcessTimer("Process-02", 2500);
        ProcessTimer p3 = new ProcessTimer("Process-03", 3000);

        cllList.addFirst(p1);
        cllList.addFirst(p2);
        cllList.addLast(p3);
        System.out.println(cllList);

        simRoundRobin(10, cllList, 500);
    }

    private static void simRoundRobin(int cycles, CLL<ProcessTimer> processes, long alocatedTime){

        if(processes.isEmpty()){
            System.out.println("CPU is idle - nothing to process!");
        } else {
            System.out.println("Number of processes to simulate: " + processes.size());
            System.out.println("Simulating Round Robin with " + cycles + " cycles and " + alocatedTime + " time for process");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (int i = 0; i < cycles; i++) {
                if (processes.isEmpty()) {
                    System.out.println("CPU finished all processes - out from looping");
                    break;
                } else {
                    ProcessTimer actual = processes.getFirst();
                    System.out.println("CPU fetched:\n" + actual);
                    if (actual.processingStep(alocatedTime)) {
                        processes.rotate();
                    } else {
                        processes.removeFirst();
                        System.out.println("Removed process: " + actual.getProcessName());
                    }
                    
                }
            }
        }
        System.out.println("Processes left: " + processes.size());
        System.out.println(processes);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

}

