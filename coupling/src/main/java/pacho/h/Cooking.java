package pacho.h;

import pacho.h.cooker.AirFryer;
import pacho.h.cooker.CookerRunner;
import pacho.h.cooker.MicrowaveOven;

public class Cooking {
    public static void main(String[] args) {
        System.out.println("Let's cook!");

        var microwaveOven = new MicrowaveOven();
        var airFryer = new AirFryer();
        var cookerRunner = new CookerRunner(microwaveOven);
//        var cookerRunner = new CookerRunner(airFryer);

        cookerRunner.run();
    }
}