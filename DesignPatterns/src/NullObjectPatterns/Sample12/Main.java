package NullObjectPatterns.Sample12;

public class Main {

    public static void main(String[] args) {

        Factory workers = new Factory();
        AbstractWorker A1 = workers.Worker("Bob");
        AbstractWorker A2 = workers.Worker("Ross");
        AbstractWorker A3 = workers.Worker("Johny");
        System.out.println(A1.getName());
        System.out.println(A2.getName());
        System.out.println(A3.getName());




    }
}
