package ComputersList;

import java.util.Comparator;

public class ComputerComparators {
    static Comparator<Computer> groupMethodByRam = Comparator.comparing(Computer::getRamMemory);
    static Comparator<Computer> groupMethodByName = Comparator.comparing(Computer::getName);
    static Comparator<Computer> groupMethodByCpu = Comparator.comparing(Computer::getCpuSpeed);
}
