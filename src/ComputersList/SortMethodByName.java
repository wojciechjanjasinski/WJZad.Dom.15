package ComputersList;

import java.util.Comparator;

public class SortMethodByName {
    static Comparator<Computer> groupMethodByName = Comparator.comparing(Computer::getName);
}
