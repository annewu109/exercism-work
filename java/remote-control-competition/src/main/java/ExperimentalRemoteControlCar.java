public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int distance = 0;
    private final static int speed = 20;

    public void drive() {
        distance += speed;
    }

    public int getDistanceTravelled() {
        return distance;
    }
}
