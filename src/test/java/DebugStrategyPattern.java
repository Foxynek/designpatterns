import com.foxin.strategy_pattern.*;
import org.junit.Test;

public class DebugStrategyPattern {

    @Test
    public void debugStrategyPattern(){

        RPSGame rps = new RPSGame();
        String ai = rps.RPSGetValue();
        String myPick = "";
        RPSStrategy strategy = new Rock();
        if (ai.equals("Paper")){
            strategy = new Scissors();
        }
        else if (ai.equals("Rock")){
            strategy = new Paper();
        }
        else if (ai.equals("Scissors")){
            strategy = new Rock();
        }
        myPick = strategy.algorithm();

        if (rps.assignWin(myPick, ai)){
            System.out.println("Vyhra " + myPick + " vs " + ai);
        }
        else System.out.println("Prohra nebo remiza " + myPick + " vs " + ai);
    }
}
