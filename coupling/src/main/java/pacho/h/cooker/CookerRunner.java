package pacho.h.cooker;

public class CookerRunner {
    MicrowaveOven cooker;
//    AirFryer cooker;

    public CookerRunner(MicrowaveOven cooker) {
//    public CookerRunner(AirFryer cooker) {
        this.cooker = cooker;
    }

    public void run() {
        System.out.println("Run " + cooker);

        cooker.setTimer(60);
        cooker.run();
    }
}
