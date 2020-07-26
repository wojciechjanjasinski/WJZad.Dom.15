package ComputersList;

import java.util.Comparator;

public class SortMethodOne {
    static Comparator<Computer> groupMethodOne = Comparator.comparing(Computer::getCpuSpeed).
            thenComparing(Computer::getRamMemory).
            thenComparing(Computer::getName);
}
