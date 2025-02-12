
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdNum : birdsPerDay) {
            if (birdNum == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        numberOfDays = Math.min(numberOfDays, birdsPerDay.length);
        int count = 0;
        for (int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdNum : birdsPerDay) {
            if (birdNum >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
