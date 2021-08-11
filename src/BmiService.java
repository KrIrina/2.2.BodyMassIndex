public class BmiService {
    public float calculate(float bodyWeight, float bodyHeight) {
        float bodyHeightMetre = bodyHeight/100;
        float bodyIndex = bodyWeight / (bodyHeightMetre * bodyHeightMetre);
        return bodyIndex;
    }
}
