import java.util.Scanner;
public class NimLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Nim p1 = new Nim(13, 3);
        int computerTakeaway;
        while (p1.getSticks() != 0) {
            System.out.println(p1.info());
            p1.setSticks(scan.nextInt());
            System.out.println(p1.info(23));
            if (p1.getSticks() <= p1.getMaxTakeAway()) {
                computerTakeaway = p1.getSticks();
            } else {
                computerTakeaway = (int) (Math.random() * p1.getMaxTakeAway()) + 1;
            }
            System.out.print("The computer takes away " + computerTakeaway + " sticks\n");
            p1.setSticks(computerTakeaway);
        }
        System.out.println("word");
    }
}
