import java.util.ArrayList;
import java.util.List;

/**
 * Main business rules to work with observers
 */
public class BRChanger implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(Observer::notifyOfSomeChanges);
    }
}
