import com.foxin.factory_pattern.Ball;
import com.foxin.factory_pattern.Floorball;
import com.foxin.factory_pattern.Football;
import org.junit.Test;

public class Debug {

    @Test
    public void debug(){
        Floorball floorball = new Floorball();
        Football football = new Football();

        Ball ball1 = floorball.createBall();
        Ball ball2 = football.createBall();

        System.out.println(ball1.type);
        System.out.println(ball2.type);
    }
}
