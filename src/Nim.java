public class Nim {
    private int sticks;
    private int maxTakeAway;
    public Nim(int sticks, int takeAway) {
        this.sticks = sticks;
        this.maxTakeAway = takeAway;
    }

    public Nim() {
        this.sticks = 13;
        this.maxTakeAway = 3;
    }

    public int getSticks() {
        return sticks;
    }

    public int getMaxTakeAway() {
        return maxTakeAway;
    }
    public String info() {
        return "There are " + getSticks() + " sticks. Take 1 - " + getMaxTakeAway() + " sticks away: ";
    }

    public String info(int hi) {
        return "There are " + getSticks() + " sticks";
    }

    public void setSticks(int sticksTaken) {
        sticksLeft(sticksTaken);
    }

    // helper method
    private void sticksLeft(int sticksTaken) {
        sticks -= sticksTaken;
    }

    public int returnLonger(String one, String two) {
        for (int i = 1; i <= sticks; i++) {
            for (int j = sticks; j < maxTakeAway; j--) {
                System.out.println(j);
            }
        }
        return one.compareTo(two);
    }
}
