package solid.isp.bad;

import lombok.extern.slf4j.Slf4j;

public class TimedDoor implements Door {

    private boolean locked;

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public boolean isDoorOpen() {
        return !locked;
    }

    @Override
    public void timeout() {
        lock();
    }
}