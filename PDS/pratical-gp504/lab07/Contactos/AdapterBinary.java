package lab07.Contactos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdapterBinary implements ContactsStorageInterface {

    private String path;

    public AdapterBinary(String path) {
        this.path = path;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            contacts = (List<Contact>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(list);
            oos.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}