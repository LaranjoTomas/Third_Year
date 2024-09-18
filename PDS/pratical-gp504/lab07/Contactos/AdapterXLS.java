// package lab07.Contactos;
//
// import org.apache.poi.ss.usermodel.*;
// import org.apache.poi.xssf.usermodel.*;
// import java.io.*;
// import java.util.*;

// public class AdapterXLS implements ContactsStorageInterface {

// private String path;

// public AdapterXLS(String path) {
// this.path = path;
// }

// @Override
// public List<Contact> loadContacts() {
// List<Contact> contacts = new ArrayList<>();
// try (InputStream is = new FileInputStream(new File(path))) {
// Workbook workbook = new XSSFWorkbook(is);
// Sheet sheet = workbook.getSheetAt(0);
// for (Row row : sheet) {
// Cell nameCell = row.getCell(0);
// Cell phoneCell = row.getCell(1);
// contacts.add(new Contact(nameCell.getStringCellValue(),
// phoneCell.getStringCellValue()));
// }
// } catch (IOException e) {
// e.printStackTrace();
// }
// return contacts;
// }

// @Override
// public boolean saveContacts(List<Contact> list) {
// Workbook workbook = new XSSFWorkbook();
// Sheet sheet = workbook.createSheet("Contacts");
// int rowNum = 0;
// for (Contact c : list) {
// Row row = sheet.createRow(rowNum++);
// row.createCell(0).setCellValue(c.getName());
// row.createCell(1).setCellValue(c.getPhone());
// }
// try (OutputStream os = new FileOutputStream(path)) {
// workbook.write(os);
// return true;
// } catch (IOException e) {
// e.printStackTrace();
// return false;
// }
// }
// }