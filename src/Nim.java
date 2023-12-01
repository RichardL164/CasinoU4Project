public class Nim {
    private int sticks;
    private int maxTakeAway;
    public Nim(int sticks, int takeAway) {
        this.sticks = sticks;
        this.maxTakeAway = takeAway;
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
        sticks -= sticksTaken;
    }
}
