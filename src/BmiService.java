public class BmiService {
    public double calculate(int bodyWeight, double bodyHeight) {
        double bodyIndex = bodyWeight / (bodyHeight * bodyHeight);
        return bodyIndex;
    }
}
