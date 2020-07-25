package CompetitionResults;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadFromUserLoop {
    public static Set<PlayerResultInfo> readFromUserUtils (){
        Set<PlayerResultInfo> playerResultInfoSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String userWantsToStop;
        do {
            playerResultInfoSet.add(ScannerPlayerResult.scannerPlayerResultDetails());
            System.out.println("Czy chcesz zakończyć wprowadzanie danych? Jeżeli tak wpisz \" STOP \" . Jeżeli nie wpisz dowolny ciąg liter");
            userWantsToStop = scanner.next();
        }while (!userWantsToStop.equals(ScannerPlayerResult.STOP_THE_SCANNER));
        scanner.close();
        System.out.println(playerResultInfoSet);
        return playerResultInfoSet;
    }
}
