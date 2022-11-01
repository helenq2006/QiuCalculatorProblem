public class Calculator {
    private double x;
    private double y;

    public Calculator( double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add() {
        return x + y;
    }

    public double subtract() {
        return x - y;
    }

    public double multiply() {
        return x * y;
    }

    public double divide() {
        return x / y;
    }

    public double exponent() {
        return Math.pow(x,y);
    }

    public double mod() {
        return x % y;
    }


}