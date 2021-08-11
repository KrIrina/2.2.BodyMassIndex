public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 74;
        double height = 1.72;
        double bmIndex = service.calculate(weight,height);
        System.out.println(bmIndex);
    }
}
