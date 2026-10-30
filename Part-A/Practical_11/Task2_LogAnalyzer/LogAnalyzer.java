import java.nio.file.*;
import java.util.List;

public class LogAnalyzer {
    public static void analyze(Path file, String keyword) throws Exception {
        List<String> lines = Files.readAllLines(file);
        long matches = lines.stream().filter(l -> l.contains(keyword)).count();
        long size = Files.size(file);
        System.out.println("File: " + file.getFileName() + " | Size: " + size + " bytes");
        System.out.println("Total Lines: " + lines.size() + " | Matches for '" + keyword + "': " + matches);
    }
}
