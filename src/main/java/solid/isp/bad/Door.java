package solid.isp.bad;

public interface Door extends TimerClient {

    void lock();

    void unlock();

    boolean isDoorOpen();
}
