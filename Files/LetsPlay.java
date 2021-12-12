import java.util.*;

public class LetsPlay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladders Game!");
        // Size Of The Board
        System.out.println("Enter Board Size");
        int bSize = in.nextInt();
        // No.of Dices
        System.out.println("Enter number of dice:");
        int nDice = in.nextInt();
        Dice dice = new Dice(nDice);

        // No.of Snakes 
        System.out.println("Enter No of Snakes:");
        int noofSnakes = in.nextInt();
        System.out.println("Enter "+noofSnakes+" Snakes positions and destinations:");
        HashMap<Integer, Snakes> snakesMap = new HashMap<Integer, Snakes>();
        in.nextLine();
        while (noofSnakes > 0) {
            String[] arr = in.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Snakes snake = new Snakes(st, en);
            snakesMap.put(st, snake);
            noofSnakes--;
        }

        // No.of Ladders
        System.out.println("Enter No of Ladders:");
        int noofLadders = in.nextInt();
        HashMap<Integer, Ladders> laddersMap = new HashMap<Integer, Ladders>();
        System.out.println("Enter "+noofLadders+" Ladders positions and destinations:");
        in.nextLine();
        while (noofLadders > 0) {
            String[] arr = in.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Ladders ladder = new Ladders(st, en);
            laddersMap.put(st, ladder);
            noofLadders--;
        }

        // No.of Players

        Queue<Player> allPlayer = new LinkedList<Player>();

        System.out.println("Enter number of players: ");
        int noofPlayers = in.nextInt();
        in.nextLine();
        System.out.println("Enter "+noofPlayers+" Players Name:");
        while (noofPlayers> 0) {
            String name = in.nextLine();
            Player p = new Player(name);
            allPlayer.add(p);
            noofPlayers--;
        }

        Board gameBoard = new Board(bSize, dice, snakesMap, laddersMap, allPlayer);
        gameBoard.startGame();

    }
}
