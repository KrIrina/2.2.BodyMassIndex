import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 74;
        float height = 172;
        float bmIndex = service.calculate(weight,height);
        System.out.println(bmIndex);
    }
}
