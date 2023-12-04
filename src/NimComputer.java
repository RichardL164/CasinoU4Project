public class NimComputer {
    private Nim p1;
    private int level;
    private int computerTakeaway;

    public NimComputer(Nim p1, int level) {
        this.p1 = p1;
        this.level = level;
    }

    public void computerSticks() {
        if (level == 1) {
            if (p1.getSticks() <= p1.getMaxTakeAway()) {
                computerTakeaway = p1.getSticks();
            } else {
                computerTakeaway = (int) (Math.random() * p1.getMaxTakeAway()) + 1;
            }
        } else if (level == 2) {
            for (int i = 1; i <= p1.getMaxTakeAway(); i++) {
                if ((p1.getSticks() - i) % (p1.getMaxTakeAway() + 1) == 0) {
                    computerTakeaway = i;
                    break;
                } else {
                    computerTakeaway = (int) (Math.random() * p1.getMaxTakeAway()) + 1;
                }
            }
        }
        System.out.print("The computer takes away " + computerTakeaway + " sticks\n");
        p1.setSticks(computerTakeaway);
        if (p1.getSticks() == 0) {
            System.out.println("You lose!!!");
        }
    }
}
