import java.util.Scanner;

public class NimLogic {
    public void setup() {
        Scanner scan = new Scanner(System.in);
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
        NimUser user = new NimUser(p1);
        NimComputer computer = new NimComputer(p1, level);
        while (p1.getSticks() > 0) {
            user.userSticks();
            computer.computerSticks();
        }
    }
}