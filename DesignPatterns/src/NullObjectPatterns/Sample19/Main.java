package NullObjectPatterns.Sample19;

public class Main {

    public static void main(String[] args) {
    WorkerFactory wf = new WorkerFactory();
        AbstractWorker worker1 = wf.getWorker("bob");
        AbstractWorker worker2 = wf.getWorker("jesus");
        System.out.println(worker1.getName());
        System.out.println(worker2.getName());



    }
}
