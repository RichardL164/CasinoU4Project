import java.util.Scanner;

public class BlackJack {
    Scanner scan = new Scanner(System.in);
    private int dealer;
    private int player1;
    private int player2;

    public BlackJack() {
    }

    public int dealernum() {
        return (int) (Math.random() * 10) + 2;
    }

    public int player1num() {
        int player1num = (int) (Math.random() * 10) + 2;
        if (player1num == 11) {
            System.out.println("Would you like the ace to be an 11 or 1: ");
            player1num = scan.nextInt();
            scan.nextLine();
        }
        player1 += player1num;
        return player1;
    }

    public int player2num() {
        int player2num = (int) (Math.random() * 10) + 2;
        if (player2num == 11) {
            System.out.println("Would you like the ace to be an 11 or 1: ");
            player2num = scan.nextInt();
            scan.nextLine();
        }
        player2 += player2num;
        return player2;
    }
}
