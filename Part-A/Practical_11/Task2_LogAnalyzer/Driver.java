import java.nio.file.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        Path log = Paths.get("app.log");
        Files.writeString(log, "INFO System started\nERROR Database timeout\nINFO Retrying connection\n");
        LogAnalyzer.analyze(log, "ERROR");
        Files.deleteIfExists(log);
    }
}
