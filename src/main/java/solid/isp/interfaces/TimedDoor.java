package solid.isp.interfaces;

public class TimedDoor implements Door, TimerClient {

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public boolean isDoorOpen() {
        return false;
    }

    @Override
    public void timeout() {

    }
}
