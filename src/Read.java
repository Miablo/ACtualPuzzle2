import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Read {
    List<String> depth = Collections.emptyList();

    public List<String> readMeasurement() throws FileNotFoundException {
        try {
            depth = Files.readAllLines(Paths.get("/Users/miablo/Desktop/ACtualPuzzle2/src/input.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // store them in arraylist
        // file input
        // read measurements

        return depth;
    }
}
