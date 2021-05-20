public class BonusMilesService {
    public int calculate(int price) {
        int every20Rubles = 20;
        int mile = 1;
        int miles = price / every20Rubles * mile;
        return miles;
    }
}