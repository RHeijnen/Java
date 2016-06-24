package NullObjectPatterns.Sample18;

public class Main {

    public static void main(String[] args) {

    BallFactory bf = new BallFactory();
        AbstractBowlingBall ball1 = bf.ballSelector("small");
        AbstractBowlingBall ball2 = bf.ballSelector("huge");
        System.out.println(ball1.getName());
        System.out.println(ball2.getName());


    }
}
