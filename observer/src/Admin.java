/**
 * Admin wants to be notified about changes
 */
public class Admin implements Observer {
    @Override
    public void notifyOfSomeChanges() {
        System.out.println("Admin has some changes!");
    }
}
