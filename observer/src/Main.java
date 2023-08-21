public class Main {
    public static void main(String[] args) {
        Observer admin = new Admin();

        Subject changer = new BRChanger();
        changer.registerObserver(admin);
        changer.notifyAllObservers();

        Observer user = new User();
        changer.registerObserver(user);
        changer.notifyAllObservers();

        changer.removeObserver(admin);
        changer.notifyAllObservers();
    }
}
