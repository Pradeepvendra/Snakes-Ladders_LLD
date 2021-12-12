public class Board {
    private Dice dice;
    private Queue<Player> allPlayer;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private int boardSize;

    Board(int boardSize, Dice dice, HashMap<Integer, Snakes> snakes, HashMap<Integer, Ladders> ladders,Queue<Player> allPlayer) {
        this.boardSize = boardSize;
        this.dice = dice;
        this.snakes = snakes;
        this.ladders = ladders;
        this.allPlayer = allPlayer;

    }

    public void startGame() {
        while (allPlayer.size()>1) {
            Player player = allPlayer.poll();
            int currLocation = player.getLocation();
            int nextLocation = currLocation + dice.rollDice();
            if (nextLocation <= boardSize) {
                if (snakes.containsKey(nextLocation)) {
                    System.out.println(player.getName() + " was bitten by a snake! at "+nextLocation);
                    Snakes obj = snakes.get(nextLocation);
                    nextLocation = obj.getEndPoint();
                } else if (ladders.containsKey(nextLocation)) {
                    System.out.println(player.getName() + " climbed a Ladder!");
                    Ladders obj = ladders.get(nextLocation);
                    nextLocation = obj.getEndPoint();
                }
                currLocation = nextLocation;
                System.out.println(player.getName() + " moved to " + currLocation);
                if (currLocation == boardSize) {
                    System.out.println();
                    System.out.println(player.getName() + " won th Game!!");
                    break;
                }
                player.setLocation(currLocation);

            }
            allPlayer.add(player);

        }
    }

}
