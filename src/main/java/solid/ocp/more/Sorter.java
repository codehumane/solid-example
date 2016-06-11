package solid.ocp.more;

import java.util.List;

public class Sorter {

    public <T extends Sortable> void sort(List<T> input) {
        input.sort((o1, o2) -> o1.getPriority().compareTo(o2.getPriority()));
    }
}
