package NullObjectPatterns.Sample20;

public class Main {

    public static void main(String[] args) {

    WorkerFactory wf = new WorkerFactory();
        AbstractWorker w1 = wf.getWorker("bob");
        AbstractWorker w2 = wf.getWorker("joe");
        AbstractWorker w3 = wf.getWorker("Jenny");
        System.out.println(w1.getName());
        System.out.println(w2.getName());
        System.out.println(w3.getName());



    }
}
