package NullObjectPatterns.Sample3;

public class Main {

    public static void main(String[] args) {

        AbstractWorker AW1 = WorkerFactory.getWorker("John");
        AbstractWorker AW2 = WorkerFactory.getWorker("Jonas");
        AbstractWorker AW3 = WorkerFactory.getWorker("Donny");
        System.out.println(AW1.getName());
        System.out.println(AW2.getName());
        System.out.println(AW3.getName());

    }
}
