package CompetitionResults;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class FileSaver {
    static String fileName = "SportResults.csv";

    public static void fileSaveMethod(Set<PlayerResultInfo> setFromUser) throws IOException {
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (PlayerResultInfo pri : setFromUser) {
                writer.write(pri.getSportDiscipline());
                writer.write(";");
                writer.write(pri.getFirstName());
                writer.write(";");
                writer.write(pri.getLastName());
                writer.write(";");
                writer.write(String.valueOf(pri.getScore()));
                writer.newLine();
            }
        }
    }
}

