public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int totalMiles = ticketPrice / 20;
        return totalMiles;
    }

}
