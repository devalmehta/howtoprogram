import java.util.Scanner;

public class GameOfChance {
    private static boolean firstRole = true;
    private static boolean playerWins = false;
    private static boolean playerMakesApoint = false;
    private static boolean playerLooses = false;
    public static void main(String[] args) {
        if(GameOfChance.isFirstRole()) {
            int firstRole = getFirstRole();
            int secondRole = getSecondRole();
            printResults(firstRole, secondRole);
        } else {
            while(GameOfChance.isPlayerLooses() || GameOfChance.isPlayerMakesApoint()) {
                int firstRole = getFirstRole();
                int secondRole = getSecondRole();
                printResults(firstRole, secondRole);
            }
        }

    }

    private static int getSecondRole() {
        System.out.println("Type \"Second Role\" for first dice role:");
        int secondRole = (1 + (int) (Math.random() * 6));
        System.out.println("Second dice roled :" + secondRole);
        return secondRole;
    }

    private static int getFirstRole() {
        System.out.println("Type \"First Role\" for first dice role:");
        Scanner in = new Scanner(System.in);
        in.next();
        int firstRole = (1 + (int) (Math.random() * 6));
        System.out.println("First dice roled :" + firstRole);
        return firstRole;
    }

    public static void printResults(int firstRole, int secondRole) {
        int sum = firstRole + secondRole;
        if( didThePlayerWin(sum)) {
            System.out.println("Player Wins!!");
            GameOfChance.setPlayerWins(true);
        }
        if (didPlayerMadeAPoint(sum)){
            System.out.println("Player Makes A Point!!");
            GameOfChance.setPlayerMakesApoint(true);
        }
        if(doesPlayerLoose(sum)){
            System.out.println("Player looses!!");
            GameOfChance.setPlayerLooses(true);
        }

    }

    private static boolean doesPlayerLoose(int sum) {
        boolean isRequireSum = (sum == 2 || sum == 3 || sum == 12);
        boolean isGameWon = GameOfChance.isFirstRole();
        return (isRequireSum && isGameWon);
    }

    private static boolean didPlayerMadeAPoint(int sum) {
        return (sum == 4|| sum == 5 || sum ==6 || sum ==8 || sum ==9 || sum ==10);
    }

    private static boolean didThePlayerWin(int sum) {
        boolean isRequireSum = (sum == 7 || sum == 11);
        boolean isGameWon = GameOfChance.isFirstRole();
        return (isRequireSum && isGameWon);
    }

    private static boolean isFirstRole() {
        return firstRole;
    }

    public static void setFirstRole(boolean firstRole) {
        GameOfChance.firstRole = firstRole;
    }

    public static boolean isPlayerWins() {
        return playerWins;
    }

    private static void setPlayerWins(boolean playerWins) {
        GameOfChance.playerWins = playerWins;
    }

    private static boolean isPlayerMakesApoint() {
        return playerMakesApoint;
    }

    private static void setPlayerMakesApoint(boolean playerMakesApoint) {
        GameOfChance.playerMakesApoint = playerMakesApoint;
    }

    private static boolean isPlayerLooses() {
        return playerLooses;
    }

    private static void setPlayerLooses(boolean playerLooses) {
        GameOfChance.playerLooses = playerLooses;
    }
}
