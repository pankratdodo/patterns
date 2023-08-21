/**
 * Needs to register new observers, remove old ones and notify them
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();
}
