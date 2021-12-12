public class Jumper {
    private int startPoint;
    private int endPoint;

    Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }
}

// Inheritence Snakes and Ladders from jumper
// NOTE:- for Snakes, startPoint is endPoint and endPoint is startPoint

class Snakes extends Jumper {
    Snakes(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }
}

class Ladders extends Jumper {
    Ladders(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }
}
