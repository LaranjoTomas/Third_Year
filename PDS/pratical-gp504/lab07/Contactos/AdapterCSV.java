package lab07.Contactos;

import java.io.*;
import java.util.*;

public class AdapterCSV implements ContactsStorageInterface {

    private String path;

    public AdapterCSV(String path) {
        this.path = path;
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                contacts.add(new Contact(values[0], values[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            for (Contact c : list) {
                pw.println(c.getName() + "," + c.getPhone());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}