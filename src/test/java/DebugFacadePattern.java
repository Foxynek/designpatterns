import com.foxin.facade_pattern.Client;
import org.junit.Test;

public class DebugFacadePattern {

    @Test
    public void debugFacadePattern(){
        Client client = new Client();
        client.f.startIgnition();
        client.f.startMoving();
        client.f.turnLeft();
        client.f.turnRight();
    }
}
