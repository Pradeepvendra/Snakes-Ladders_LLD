public class Dice {
    private int noOfDice;
    Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }
    int getSum(){
        int sum=0;
        for(int i=0;i<noOfDice;i++){
            sum=sum+ (new Random().nextInt(6) + 1);}
        return sum;}
    public int rollDice() {
        if(getSum()==(noOfDice*6) & noOfDice>1){
            return 0;
        }
        else if(getSum()<(noOfDice*6) & noOfDice>1){
            return (getSum()%6)+1;
        }
        else{
            return  getSum();

        }
    }
}
