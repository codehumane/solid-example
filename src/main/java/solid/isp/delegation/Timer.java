package solid.isp.delegation;

public interface Timer {

    /**
     * 타임아웃을 알려주기 위한 대상을 등록한다.
     *
     * @param timeout
     * @param timerClient
     */
    void register(int timeout, TimerClient timerClient);
}
