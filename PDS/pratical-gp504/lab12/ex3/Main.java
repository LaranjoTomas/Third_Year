package lab12.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java Anti-Stress", 123456, 2022, "Omodionah");
        Livro livro2 = new Livro("A Guerra dos Padrões", 789012, 2022, "Jorge Omel");
        Livro livro3 = new Livro("A Procura da Luz", 345678, 2022, "Khumatkli");

        livro1.setState(new Inventario(livro1));
        livro2.setState(new Inventario(livro2));
        livro3.setState(new Inventario(livro3));

        Livro[] livros = { livro1, livro2, livro3 };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*** Biblioteca ***");
            for (int i = 0; i < livros.length; i++) {
                System.out.println((i + 1) + " " + livros[i]);
            }

            System.out.println(">> <livro>, <operação: (1)regista; (2)requisita; (3)devolve; (4)reserva; (5)cancela");
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (parts.length < 2) {
                System.out.println("Input format should be <book>,<operation>");
                continue;
            }
            int livroIndex = Integer.parseInt(parts[0].trim()) - 1;
            int operacao = Integer.parseInt(parts[1].trim());

            switch (operacao) {
                case 1:
                    livros[livroIndex].regista();
                    break;
                case 2:
                    livros[livroIndex].requisita();
                    break;
                case 3:
                    livros[livroIndex].devolve();
                    break;
                case 4:
                    livros[livroIndex].reserva();
                    break;
                case 5:
                    livros[livroIndex].cancelaReserva();
                    break;
            }
        }
    }
}