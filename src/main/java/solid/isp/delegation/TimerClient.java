package solid.isp.delegation;

public interface TimerClient {

    /**
     * 타임아웃이 됨을 공지 받는다.
     */
    void timeout();
}
