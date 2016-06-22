package NullObjectPatterns.Sample1;

public class Main {

    public static void main(String[] args) {

        AbstractWorker worker1 = WorkerFactory.getWorker("BOB");
        AbstractWorker worker2 = WorkerFactory.getWorker("EVA");
        AbstractWorker worker3 = WorkerFactory.getWorker("RENE");

        System.out.println(worker1.getName());
        System.out.println(worker2.getName());
        System.out.println(worker3.getName());
    }
}
