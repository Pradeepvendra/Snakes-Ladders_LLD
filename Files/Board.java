public class Board {
    private Dice dice;
    private Queue<Player> allPlayer;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private int boardSize;

    Board(int boardSize, Dice dice, HashMap<Integer, Snakes> snakes, HashMap<Integer, Ladders> ladders,
            Queue<Player> allPlayer) {
        this.boardSize = boardSize;
        this.dice = dice;
        this.snakes = snakes;
        this.ladders = ladders;
        this.allPlayer = allPlayer;

    }

    public void startGame() {
        while (allPlayer.size()>1) {
            Player player = allPlayer.poll();
            int currLoc = player.getLocation();
            int nextLoc = currLoc + dice.rollDice();
            if (nextLoc <= boardSize) {
                if (snakes.containsKey(nextLoc)) {
                    System.out.println(player.getName() + " was bitten by a snake! at "+nextLoc);
                    Snakes snake = snakes.get(nextLoc);
                    nextLoc = snake.getEndPoint();
                } else if (ladders.containsKey(nextLoc)) {
                    System.out.println(player.getName() + " climbed a Ladder!");
                    Ladders ladder = ladders.get(nextLoc);
                    nextLoc = ladder.getEndPoint();
                }
                currLoc = nextLoc;
                System.out.println(player.getName() + " moved to " + currLoc);
                if (currLoc == boardSize) {
                    System.out.println();
                    System.out.println(player.getName() + " won th Game!!");
                    break;
                }
                player.setLocation(currLoc);

            }
            allPlayer.add(player);

        }
    }

}
