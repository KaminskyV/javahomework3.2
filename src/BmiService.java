public class BmiService {
    public double calculate(double a, double b) {
        double c = a / 100;
        double cost = (c*c);
        double index = b / cost;
        return index;
    }
}
