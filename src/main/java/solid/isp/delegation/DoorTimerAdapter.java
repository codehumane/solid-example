package solid.isp.delegation;

public class DoorTimerAdapter implements TimerClient {

    private TimedDoor timedDoor;

    public DoorTimerAdapter(TimedDoor timedDoor) {
        this.timedDoor = timedDoor;
    }

    @Override
    public void timeout() {
        timedDoor.lock();
    }
}
