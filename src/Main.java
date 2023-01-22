public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 180; //рост см
        double weight = 70; //вес кг
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}