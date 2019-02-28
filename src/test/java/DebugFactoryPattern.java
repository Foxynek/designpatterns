import com.foxin.factory_pattern.Ball;
import com.foxin.factory_pattern.Basketball;
import com.foxin.factory_pattern.Floorball;
import com.foxin.factory_pattern.Football;
import org.junit.Test;

public class DebugFactoryPattern {

    @Test
    public void debugFactoryPattern(){
        Floorball floorball = new Floorball();
        Football football = new Football();
        Basketball basketball = new Basketball();

        Ball ball1 = floorball.createBall();
        Ball ball2 = football.createBall();
        Ball ball3 = basketball.createBall();

        System.out.println(ball3.type);
        System.out.println(ball1.type);
        System.out.println(ball2.type);
    }
}
