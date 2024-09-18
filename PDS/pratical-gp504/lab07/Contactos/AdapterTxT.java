package lab07.Contactos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdapterTxT implements ContactsStorageInterface {

    private String path;

    public AdapterTxT(String path) {
        this.path = path;
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                contacts.add(new Contact(data[0], data[1]));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (Contact c : list) {
                bw.write(c.getName() + "," + c.getPhone() + "\n");
            }
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
