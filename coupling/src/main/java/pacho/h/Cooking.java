package pacho.h;

import pacho.h.cooker.AirFryer;
import pacho.h.cooker.CookerRunner;
import pacho.h.cooker.MicrowaveOven;

public class Cooking {
    public static void main(String[] args) {
        System.out.println("Let's cook!");

        var microwaveOven = new MicrowaveOven();
        var airFryer = new AirFryer();
        var microwaveOvenRunner = new CookerRunner(microwaveOven, 60);
        var airFryerRunner = new CookerRunner(airFryer, 120);

        microwaveOvenRunner.run();
        airFryerRunner.run();
    }
}