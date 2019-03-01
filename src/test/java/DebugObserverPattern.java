import com.foxin.observer_pattern.availableEshops.Northerner;
import com.foxin.observer_pattern.availableEshops.TaxFreeSnus;
import com.foxin.observer_pattern.tobaccoTypes.Siberia;
import com.foxin.observer_pattern.tobaccoTypes.Sisu;
import com.foxin.observer_pattern.tobaccoTypes.Skruf;
import com.foxin.observer_pattern.tobaccoTypes.Thunder;
import org.junit.Test;

public class DebugObserverPattern {

    @Test
    public void debugObserverPattern(){
        Northerner northerner = new Northerner();
        TaxFreeSnus taxFreeSnus = new TaxFreeSnus();

        Skruf skruf = new Skruf(40, 100);
        Thunder thunder = new Thunder(5, 100);
        Sisu sisu = new Sisu(99, 100);
        Siberia siberia = new Siberia(62, 200);

        northerner.setDiscount(15);
        northerner.setPackageDiscount(5);
        northerner.addTobacco(skruf);
        northerner.addTobacco(thunder);
        northerner.addTobacco(sisu);
        northerner.addTobacco(siberia);
        northerner.updateAvailableItems();

        taxFreeSnus.setDiscount(20);
        taxFreeSnus.setPackageDiscount(10);
        taxFreeSnus.addTobacco(skruf);
        taxFreeSnus.addTobacco(thunder);
        taxFreeSnus.updateAvailableItems();

        northerner.removeTobacco(skruf);
        northerner.removeTobacco(thunder);
        northerner.setDiscount(30);
        northerner.updateAvailableItems();
    }
}
