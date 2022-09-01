package chapter3.varianta.bus;

public class Runner {
    private static final BusRepository BUS_REPOSITORY = new BusRepository();

    public static void main(String[] args) {
        Bus firstBus = new Bus("Driver1 A.M.", "A123CA", "720A", "BOHDAN",
                1990, 400000);
        Bus secondBus = new Bus("Driver2 P.K.", "B345VA", "800", "FORD",
                2012, 400000);
        Bus thirdBus = new Bus("Driver2 J.M.", "L775FD", "720A", "TOYOTA",
                2015, 550000);

        BUS_REPOSITORY.addDBuses(firstBus);
        BUS_REPOSITORY.addDBuses(secondBus);
        BUS_REPOSITORY.addDBuses(thirdBus);

        System.out.println(BUS_REPOSITORY.findByRouteNumber("720A"));
        System.out.println();
        System.out.println(BUS_REPOSITORY.findByExploitationMoreGivenPeriod(30));
        System.out.println();
        System.out.println(BUS_REPOSITORY.findByMileageGreaterGivenDistance(500000));
    }
}


