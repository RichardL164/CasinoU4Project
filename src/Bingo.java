public class Bingo {

    private int[][] board1;
    private int[][] board2;

    public Bingo() {
        board1 = new int[5][5];
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                board1[i][j] = (int) (Math.random() * 75) + 1;
                System.out.print(board1[i][j]);
            }
            System.out.println();
        }
        board2 = new int[5][5];
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                board2[i][j] = (int) (Math.random() * 75) + 1;
                System.out.print(board2[i][j]);
            }
            System.out.println();
        }
    }

    public int randNum() {
        return (int) (Math.random() * 75) + 1;
    }
}
