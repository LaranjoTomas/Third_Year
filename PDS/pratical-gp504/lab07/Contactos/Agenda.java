package lab07.Contactos;

import java.util.ArrayList;
import java.util.List;

public class Agenda implements ContactsInterface {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public void openAndLoad(ContactsStorageInterface store) {
        contacts = store.loadContacts();
    }

    @Override
    public void saveAndClose() {
        saveAndClose(new AdapterTxT("contacts.txt"));
    }

    @Override
    public void saveAndClose(ContactsStorageInterface store) {
        store.saveContacts(contacts);
    }

    @Override
    public boolean exist(Contact contact) {
        return contacts.contains(contact);
    }

    @Override
    public Contact getByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean add(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            System.out.println("Added contact: " + contact);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Contact contact) {
        return contacts.remove(contact);
    }

    public static void performOperationsOnAgenda(Agenda agenda) {
        // Creating contacts
        Contact a1 = new Contact("Juan", "123123123");
        Contact a2 = new Contact("Pedro", "123456789");
        Contact a3 = new Contact("Maria", "987654321");
    
        System.out.println("-----------------------------");
        // Adding contacts to the agenda
        System.out.println("Adding contacts to the agenda");
        agenda.add(a1);
        agenda.add(a2);
        agenda.add(a3);
        System.out.println("-----------------------------");
    
        // Checking if contacts exist
        System.out.println("Checking if contacts exist after adding them");
        System.out.println("c1: " + agenda.exist(a1));
        System.out.println("c2: " + agenda.exist(a2));
        System.out.println("c3: " + agenda.exist(a3));
        System.out.println("-----------------------------");
    
        // Getting contacts by name
        System.out.println("Getting contacts by name");
        System.out.println(agenda.getByName("Juan"));
        System.out.println(agenda.getByName("Pedro"));
        System.out.println(agenda.getByName("Maria"));
        System.out.println("-----------------------------");
    
        // Removing contacts
        System.out.println("Removing contact a2");
        agenda.remove(a2);
        System.out.println("-----------------------------");
    
        // Checking if contacts exist
        System.out.println("Checking if contacts exist after removing them");
        System.out.println("a1: " + agenda.exist(a1));
        System.out.println("a2: " + agenda.exist(a2));
        System.out.println("a3: " + agenda.exist(a3));
        System.out.println("-----------------------------");
    }

}