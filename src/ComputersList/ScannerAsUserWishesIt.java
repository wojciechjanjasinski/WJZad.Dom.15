package ComputersList;

import java.util.ArrayList;
import java.util.Scanner;

import static ComputersList.ComputerComparators.groupMethodByCpu;
import static ComputersList.ComputerComparators.groupMethodByName;
import static ComputersList.ComputerComparators.groupMethodByRam;

public class ScannerAsUserWishesIt {
    public static void scannerOrderFromUser (ArrayList<Computer> computerArrayListFromUser){
        System.out.println("Witamy w sklepie \"KLM-Computers\" !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szanowny użytkowniku podaj proszę, jak mamy posortować komputery dostępne w naszym sklepie. \n " +
                "Jeżeli według prędkości procesora napisz \" procesor \" \n " +
                "Jeżeli według wielkośći pamięci RAM napisz \" ram \" \n " +
                "Jeżeli według nazwy w porządku alfabetycznym napisz \" nazwa \"");
        String userChoice = scanner.nextLine();
        final String CPU = "procesor";
        final String RAM = "ram";
        final String NAME = "nazwa";
        switch (userChoice) {
            case CPU -> {
                computerArrayListFromUser.sort(groupMethodByCpu);
                System.out.println(computerArrayListFromUser);
            }
            case RAM -> {
                computerArrayListFromUser.sort(groupMethodByRam);
                System.out.println(computerArrayListFromUser);
            }
            case NAME -> {
                computerArrayListFromUser.sort(groupMethodByName);
                System.out.println(computerArrayListFromUser);
            }
            default -> {
                System.out.println("Wprowadziłeś niepoprawną informację nie mogę wyświetlić uporządkowanej listy.");
                scanner.close();
            }
        }
        scanner.close();
    }
}
