package pacho.h.cooker;

public class MicrowaveOven {
    private final String name = "전자렌지";
    private int timer;

    public void setTimer(int seconds) {
        this.timer = seconds;
        System.out.println( name + "의 타이머를 " + timer + "초로 설정했습니다.");
    }

    public void run() {
        System.out.println( name + "가 지금부터 " + timer + "초 동안 동작합니다.");
    }
}
