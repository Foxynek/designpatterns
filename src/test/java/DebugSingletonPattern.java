import com.foxin.singleton_pattern.Championship;
import com.foxin.singleton_pattern.Team;
import org.junit.Test;

public class DebugSingletonPattern {

    @Test
    public void debugSingletonPattern(){
        Team barca = new Team("Barcelona");
        Team madrid = new Team("RealM");
        Team arsenal = new Team("Arsenal");
        Team chelsea = new Team("Chelsea");

        Championship.getChampionship().playOff(barca, madrid, arsenal, chelsea);
    }
}
