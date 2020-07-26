package ComputersList;

import java.util.ArrayList;
import java.util.Comparator;

import static ComputersList.ScannerAsUserWishesIt.scannerOrderFromUser;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Computer> computerArrayList = new ArrayList<>();
        computerArrayList.add(new Computer("FX-1000", 6200, 16));
        computerArrayList.add(new Computer("FX-1200", 6400, 32));
        computerArrayList.add(new Computer("FX-1200", 6400, 64));
        computerArrayList.add(new Computer("FX-1200", 5200, 128));

        Comparator<Computer> sorterComputersInDefaultOrder = Comparator.comparing(Computer::getName);
        computerArrayList.sort(sorterComputersInDefaultOrder);
        System.out.println(computerArrayList);

        scannerOrderFromUser (computerArrayList);

    }
}
