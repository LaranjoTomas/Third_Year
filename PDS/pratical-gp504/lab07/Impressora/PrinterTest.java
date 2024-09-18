package lab07.Impressora;

import java.util.ArrayList;
import java.util.List;

public class PrinterTest {
    
    private static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AdvancedPrinterInterface p = new AdvancedPrinter();
        AdvancedPrinterInterface p2 = new PrinterAdapter(new BasicPrinter());

        List<Document> docs = new ArrayList<Document>();
        docs.add(new Document("text1.txt"));
        docs.add(new Document("text2.txt"));
        docs.add(new Document("text3.txt"));

        ////////////////////////////////////////
        System.out.println("Testing AdvancedPrinter");

        p.print(docs.get(0));   // print first document only
        pause(2000);            // wait for a while

        p.print(docs);
        p.showQueuedJobs();
        pause(6000);            // wait for a while

        p.print(docs);
        p.cancelJob(6);
        p.showQueuedJobs();
        pause(6000);            // wait for a while

        p.print(docs);
        p.cancelAll();
        p.showQueuedJobs();

        pause(6000);            // wait for a while

        ////////////////////////////////////////
        System.out.println("Testing PrinterAdapter");

        p2.print(docs.get(0));   // print first document only
        pause(2000);            // wait for a while

        p2.print(docs);
        p2.showQueuedJobs();
        pause(6000);            // wait for a while

        p2.print(docs);
        p2.cancelJob(6);
        p2.showQueuedJobs();
        pause(6000);            // wait for a while

        p2.print(docs);
        p2.cancelAll();
        p2.showQueuedJobs();

        pause(6000);            // wait for a while

        return;
    }
}