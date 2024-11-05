public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 17342;
        int totalMiles = service.calculate(ticketPrice); // должно получиться 500
        System.out.println(totalMiles);
    }
}