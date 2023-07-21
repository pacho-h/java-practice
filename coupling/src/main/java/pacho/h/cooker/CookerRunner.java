package pacho.h.cooker;

public class CookerRunner {
    CookerFunction cooker;
    int timer;

    public CookerRunner(CookerFunction cooker, int timer) {
        this.cooker = cooker;
        this.timer = timer;
    }

    public void run() {
        System.out.println("Run " + cooker);

        cooker.setTimer(timer);
        cooker.run();
    }
}
