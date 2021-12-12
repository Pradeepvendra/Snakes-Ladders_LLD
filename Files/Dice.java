public class Dice {
    private int noOfDice;
    Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }
    // rolling the dice 
    public int rollDice() {
        return ((int) (Math.random() * (6 * noOfDice - 1 * noOfDice))) + 1;
    }
}
