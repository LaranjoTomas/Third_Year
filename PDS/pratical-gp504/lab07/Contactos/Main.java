package lab07.Contactos;

public class Main {

    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();

        // Using text storage
        ContactsStorageInterface storeTxT = new AdapterTxT("lab07/Contactos/contacts.txt");
        agenda.openAndLoad(storeTxT);
        Agenda.performOperationsOnAgenda(agenda);
        agenda.saveAndClose(storeTxT);

        // Using binary storage
        ContactsStorageInterface storeBi = new AdapterBinary("lab07/Contactos/contactsBi.bin");
        agenda.openAndLoad(storeBi);
        Agenda.performOperationsOnAgenda(agenda);
        agenda.saveAndClose(storeBi);

        // // Using JSON storage
        // ContactsStorageInterface storeJson = new
        // AdapterJSON("lab07/Contactos/contacts.json");
        // agenda.openAndLoad(storeJson);
        // Agenda.performOperationsOnAgenda(agenda);
        // agenda.saveAndClose(storeJson);

        // Using CSV storage
        ContactsStorageInterface storeCsv = new AdapterCSV("lab07/Contactos/contacts.csv");
        agenda.openAndLoad(storeCsv);
        Agenda.performOperationsOnAgenda(agenda);
        agenda.saveAndClose(storeCsv);

        // // Using XML storage
        // ContactsStorageInterface storeXml = new
        // AdapterXML("lab07/Contactos/contacts.xml");
        // agenda.openAndLoad(storeXml);
        // Agenda.performOperationsOnAgenda(agenda);
        // agenda.saveAndClose(storeXml);
    }
}