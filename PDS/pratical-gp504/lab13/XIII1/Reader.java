package lab13.XIII1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader implements ProductsReader {

    public String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Product> getItems() {
        List<Product> produtos = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while (reader.ready()) {
                line = reader.readLine();
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split("\t");
                if (parts.length < 4) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }
                String type = parts[0];
                String matricula = parts[1];
                String descricao = parts[2];
                double kms = Double.parseDouble(parts[3]);
    
                switch (type) {
                    case "Car":
                        produtos.add(new Car(matricula, descricao, kms));
                        break;
                    case "Van":
                        produtos.add(new Van(matricula, descricao, kms));
                        break;
                    case "Motorcycle":
                        produtos.add(new Motorcycle(matricula, descricao, kms));
                        break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found!");
            System.exit(1);
        }
        return produtos;
    }

}
