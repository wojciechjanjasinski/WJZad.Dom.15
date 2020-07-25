package CompetitionResults;

import java.util.Scanner;

public class ScannerPlayerResult {
    final static String STOP_THE_SCANNER = "STOP";

    public static String getStopTheScanner() {
        return STOP_THE_SCANNER;
    }

    public static PlayerResultInfo scannerPlayerResultDetails() {
        System.out.println("Witamy w programie \"Sports Results 0.0.1\" zapisującym wyniki zawodów sportowych do pliku! " +
                "\n Aby zakończyć wprowadzanie danych do programu i wyświetlić wprowadzone dane wpisz prosze wielkimi literami komendę \"STOP\" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę nazwę dyscypliny sportowej: ");
        String fromUserSportDiscipline = scanner.nextLine();
        System.out.println("Podaj proszę imię zawodnika: ");
        String fromUserFirstName = scanner.nextLine();
        System.out.println("Podaj proszę nazwisko zawodnika: ");
        String fromUserLastName = scanner.nextLine();
        System.out.println("Podaj prosze liczbę punktów uzyskanych przez użytkownika: ");
        double fromUserScore = scanner.nextDouble();
        return new PlayerResultInfo(fromUserSportDiscipline, fromUserFirstName, fromUserLastName, fromUserScore);
    }


}
