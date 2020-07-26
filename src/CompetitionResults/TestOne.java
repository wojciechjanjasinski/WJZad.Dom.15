package CompetitionResults;

import java.io.IOException;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) throws IOException {
        Set<PlayerResultInfo> testSet = ReadFromUserLoop.readFromUserUtils ();
        FileSaver.fileSaveMethod(testSet);
    }
}
