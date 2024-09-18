package lab07.Impressora;

import java.util.List;
import java.util.ArrayList;

public class PrinterAdapter implements AdvancedPrinterInterface {
    private BasicPrinter basicPrinter;

    public PrinterAdapter(BasicPrinter basicPrinter) {
        this.basicPrinter = basicPrinter;
    }

    @Override
    public int print(Document doc) {
        basicPrinter.print(doc.getContent());
        return 0; // return a default job ID
    }

    @Override
    public List<Integer> print(List<Document> docs) {
        for (Document doc : docs) {
            basicPrinter.print(doc.getContent());
        }
        return new ArrayList<>(); 
    }

    @Override
    public void showQueuedJobs() {
        System.out.println("No jobs queued.");
    }

    @Override
    public boolean cancelJob(int jobId) {
        return false;
    }

    @Override
    public void cancelAll() {
        System.out.println("No jobs to cancel.");
    }
}