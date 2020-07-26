package ComputersList;

import java.util.Comparator;

public class SortMethodByRamMemory {
    static Comparator<Computer> groupMethodByRam = Comparator.comparing(Computer::getRamMemory);
}
