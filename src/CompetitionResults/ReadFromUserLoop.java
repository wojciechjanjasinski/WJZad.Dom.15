package CompetitionResults;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadFromUserLoop {
    public static Set<PlayerResultInfo> readFromUserUtils() {
        Set<PlayerResultInfo> playerResultInfoSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String userWantsToStop;
        do {
            playerResultInfoSet.add(ScannerPlayerResult.scannerPlayerResultDetails());
            System.out.println("Czy chcesz zakończyć wprowadzanie danych? Jeżeli tak wpisz \" STOP \" . \n Jeżeli nie wpisz dowolny ciąg liter i wciśnji klawisz ENTER, aby kontynować");
            userWantsToStop = scanner.next();
        } while (!userWantsToStop.equals(ScannerPlayerResult.getStopTheScanner()));
        scanner.close();
        System.out.println(playerResultInfoSet);
        return playerResultInfoSet;
    }
}
