public class BmiService {
    public double calculate(double a, double b) {
        double height = a / 100;
        double square = (height * height);
        double index = b / square;
        return index;
    }
}
