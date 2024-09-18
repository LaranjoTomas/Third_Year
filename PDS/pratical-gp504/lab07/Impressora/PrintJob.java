package lab07.Impressora;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintJob implements Callable<Void> {

    private Document document;
    private int myJobId;
    private static AtomicInteger REALjobId = new AtomicInteger(0);

    public PrintJob(Document document, int jobId) {
        this.document = document;
        this.myJobId = REALjobId.getAndIncrement();
    }

    public Document getDocument() {
        return this.document;
    }

    public int getJobId() {
        return this.myJobId;
    }

    public Void call() {
        System.out.println("Finished Job " + this.myJobId + ": " + this.document.getName());
        return null;
    }
}
