class ProductionRemoteControlCar
        implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int distance = 0;
    private final static int speed = 10;
    private int victoryNum = 0;

    public void drive() {
        distance += speed;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victoryNum;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victoryNum = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(getNumberOfVictories(), otherCar.getNumberOfVictories());
    }
}
