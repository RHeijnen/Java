package NullObjectPatterns.Sample22;

public class Main {

    public static void main(String[] args) {

    WorkerFactory wf = new WorkerFactory();
        AbstractWorker worker1 = wf.getWorker("bob");
        AbstractWorker worker2 = wf.getWorker("jenny");
        AbstractWorker worker3 = wf.getWorker("Stark");
        System.out.println(worker1.getName());
        System.out.println(worker2.getName());
        System.out.println(worker3.getName());


    }
}
