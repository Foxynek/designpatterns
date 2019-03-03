import com.foxin.state_pattern.AbstractState;
import com.foxin.state_pattern.HandlerClass;
import com.foxin.state_pattern.StateOne;
import org.junit.Test;

public class DebugStatePattern {

    @Test
    public void debugStatePattern(){
        AbstractState abstractState = new StateOne();
        HandlerClass handler = new HandlerClass(abstractState);
        handler.currentState.procedure();
        handler.toggleState();
        handler.currentState.procedure();
        handler.toggleState();
        handler.currentState.procedure();
    }
}
