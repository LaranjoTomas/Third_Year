// package lab07.Contactos;

// import org.json.simple.JSONArray;

// import java.io.*;
// import java.nio.file.*;
// import java.util.*;

// public class AdapterJSON implements ContactsStorageInterface {

//     private String path;

//     public AdapterJSON(String path) {
//         this.path = path;
//     }

//     @Override
//     public List<Contact> loadContacts() {
//         List<Contact> contacts = new ArrayList<>();
//         try {
//             String content = new String(Files.readAllBytes(Paths.get(path)));
//             JsonReader jsonReader = Json.createReader(new StringReader(content));
//             JsonArray jsonArray = jsonReader.readArray();
//             for (JsonValue jsonValue : jsonArray) {
//                 JsonObject jsonObject = jsonValue.asJsonObject();
//                 contacts.add(new Contact(jsonObject.getString("name"), jsonObject.getString("phone")));
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         return contacts;
//     }

//     @Override
//     public boolean saveContacts(List<Contact> list) {
//         JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
//         for (Contact c : list) {
//             JsonObject jsonObject = Json.createObjectBuilder()
//                 .add("name", c.getName())
//                 .add("phone", c.getPhone())
//                 .build();
//             jsonArrayBuilder.add(jsonObject);
//         }
//         JsonArray jsonArray = jsonArrayBuilder.build();
//         try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
//             pw.print(jsonArray.toString());
//             return true;
//         } catch (IOException e) {
//             e.printStackTrace();
//             return false;
//         }
//     }
// }