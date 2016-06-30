package solid.isp.bad;

public class TimeFreeDoor implements Door {

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
        // unnecessary implementation
    }
}
