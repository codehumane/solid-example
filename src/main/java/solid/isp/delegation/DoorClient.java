package solid.isp.delegation;

public class DoorClient {

    private Door door;

    public DoorClient(Door door) {
        this.door = door;
    }

    public void toggle() {
        if (door.isDoorOpen()) {
            door.lock();
        } else {
            door.unlock();
        }
    }

}
