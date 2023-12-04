import java.util.Scanner;
public class NimUser {
    private Nim p1;

    public NimUser(Nim p1) {
        this.p1 = p1;
    }

    public void userSticks() {
            Scanner scan = new Scanner(System.in);
            System.out.println(p1.info());
            int userTakeaway = scan.nextInt();
            while (userTakeaway <= 0 || userTakeaway > p1.getMaxTakeAway()) {
                System.out.println(p1.info());
                userTakeaway = scan.nextInt();
            }
            p1.setSticks(userTakeaway);

            System.out.println(p1.info(1));
            if (p1.getSticks() == 0) {
                System.out.println("You win!!!");
            }
        }
    }

