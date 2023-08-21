/**
 * User wants to be notified about changes
 */
public class User implements Observer {
    @Override
    public void notifyOfSomeChanges() {
        System.out.println("User has some changes!");
    }
}
