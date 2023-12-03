import java.util.Scanner;
public class NimLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int computerTakeaway = 0;
        int userTakeaway;
        System.out.print("What level do you want to play (1 or 2)? ");
        int level = scan.nextInt();
        Nim p1 = new Nim();
        if (level == 2) {
            System.out.print("How many sticks will there be? ");
            int sticks = scan.nextInt();
            System.out.print("How many sticks can you take at once? ");
            int takeAway = scan.nextInt();
            p1 = new Nim(sticks, takeAway);
        }

        while (p1.getSticks() != 0) {
            System.out.println(p1.info());
            userTakeaway = scan.nextInt();
            while (userTakeaway <= 0 || userTakeaway > p1.getMaxTakeAway()) {
                System.out.println(p1.info());
                userTakeaway = scan.nextInt();
            }
            p1.setSticks(userTakeaway);

            System.out.println(p1.info(1));
            if (p1.getSticks() == 0) {
                System.out.println("You win!!!");
                break;
            }

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
}
