package ComputersList;

import java.util.Comparator;

public class SortMethodByCpu {
    static Comparator<Computer> groupMethodByCpu = Comparator.comparing(Computer::getCpuSpeed);
}
