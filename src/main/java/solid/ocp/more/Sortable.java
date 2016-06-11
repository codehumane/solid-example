package solid.ocp.more;

public interface Sortable {

    enum Priority {
        HIGH, LOW
    }

    Priority getPriority();
}
