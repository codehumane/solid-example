package solid.isp.delegation;

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
}