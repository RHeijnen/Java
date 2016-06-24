package NullObjectPatterns.Sample18;

/**
 * Created by Indi on 6/23/2016.
 */
public class BallFactory {
    String[] balls = {"big","small","red"};
    public AbstractBowlingBall ballSelector(String name){
        for(int i = 0; i < balls.length;i++){
            if(balls[i].equals(name)){
                return new BowlingBall(name);
            }
        }
        return new NullBowlingBall();
    }
}
