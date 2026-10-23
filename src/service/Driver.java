package service;

import static java.lang.System.out;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Account;
import model.CurrentAccount;
import model.SavingsAccount;
import util.ReportGenerator;
import util.StatePersister;
import util.TransactionLog;

public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path dataDir = Paths.get("data");
        Path logsDir = Paths.get("logs");
        Path stateFile = dataDir.resolve("accounts.dat");
        Path logFile1 = logsDir.resolve("batch1.log");
        Path logFile2 = logsDir.resolve("batch2.log");
        Path reportFile = dataDir.resolve("summary_report.txt");

        Account[] originalAccounts = new Account[2];
        originalAccounts[0] = new SavingsAccount("Suresh", 15000, 2000);
        originalAccounts[1] = new CurrentAccount("Ramesh", 25000, 10000);

        out.println("1. Saving accounts to file: " + stateFile);
        StatePersister.save(originalAccounts, stateFile);

        out.println("2. Reloading accounts from file...");
        Account[] reloadedAccounts = StatePersister.load(stateFile);
        for (Account acc : reloadedAccounts) {
            out.println("Reloaded: " + acc);
        }

        out.println("\n3. Writing transaction logs...");
        TransactionLog.append(logFile1, "DEPOSIT AC0001 5000");
        TransactionLog.append(logFile1, "WITHDRAW AC0001 1000");
        TransactionLog.append(logFile2, "DEPOSIT AC0002 8000");
        TransactionLog.append(logFile2, "WITHDRAW AC0002 2500");

        out.println("4. Generating end-of-day summary report...");
        ReportGenerator.generateReport(logsDir, reportFile);

        out.println("\n--- Report Content ---");
        String reportContent = Files.readString(reportFile);
        out.println(reportContent);
    }
}
