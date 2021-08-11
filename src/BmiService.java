public class BmiService {
    public int calculate(int bodyWeight, int bodyHeight) {
        int bodyIndex = 10000 * bodyWeight / (bodyHeight * bodyHeight);
        return bodyIndex;
    }
}
