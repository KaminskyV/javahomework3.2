public class BmiService {
    public double calculate(double parameter_1, double parameter_2) {
        double fraction = parameter_1 / 100;
        double square = (fraction * fraction);
        double index = parameter_2 / square;
        return index;
    }
}
