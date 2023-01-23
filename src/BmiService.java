public class BmiService {

    public double calculate(double height, double weight) {
        double fraction = height / 100;
        double square = (fraction * fraction);
        double index = weight / square;

        return index;
    }
}
