package TesteTipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

// Notas:
// Não altere o código apresentado na alinea 1
// Deve completar o código das alineas 2 e 3
// Pode comentar código para garantir que vai executando parcialmente

public class PDS2021 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("pds2021.txt"));
		test(System.out); // executa e escreve na consola
		fl.println(System.getProperty("user.dir"));
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);
		/*
		 * alinea3(out);
		 */
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");
		BasicCamperService onwheels = new BasicCamperService();

		Cliente c1 = new Cliente("Marco Silva", "Setúbal", 32);
		Cliente c2 = new Cliente("Joana Inácio", "Viseu", 54);
		Cliente c3 = new Cliente("Carolina Marques", "Vila Real", 27);
		Cliente c4 = new Cliente("Telmo Sousa", "Coimbra", 51);

		ICamper h1 = onwheels.registaCamper(4, "MotorHome com quatro lugares, 3 camas, cozinha, mesa, WC.");
		ICamper h2 = onwheels.registaCamper(4, "Camper van com quatro lugares, 2 camas, mesa.");
		ICamper h3 = onwheels.registaCamper(2, "Camper van com dois lugares, 1 cama, cozinha, mesa, WC.");
		ICamper h4 = onwheels.registaCamper(2, "Tenda de tejadilho para duas pessoas, de montagem rápida.");

		out.println("\n--- Campers disponíveis :");
		for (ICamper camper : onwheels.getCampersDisponiveis())
			out.println(camper);
		out.println("\n");

		out.println(onwheels.registaAluguer(c1, h1));
		out.println(onwheels.registaAluguer(c2, h3));

		out.println("\n--- Campers disponíveis :");
		for (ICamper camper : onwheels.getCampersDisponiveis())
			out.println(camper);
		out.println("\n");

		out.println(onwheels.terminaAluguer(c1, h1));

		out.println("\n--- Campers disponíveis :");
		for (ICamper camper : onwheels.getCampersDisponiveis())
			out.println(camper);
		out.println("\n");

	}

	private static void alinea2(PrintStream out) {
		out.println("\n\nAlínea 2 (exemplo de output) ----------------------------------\n");
		CamperService broker = new CamperService();

		owner p1 = new owner("Jose Almeida", "Lisboa", 45);
		owner p2 = new owner("Ana Costa", "Porto", 38);

		broker.registaUtilizador(p1);
		broker.registaUtilizador(p2);

		Cliente c1 = new Cliente("Marco Silva", "Setúbal", 32);
		Cliente c2 = new Cliente("Joana Inácio", "Viseu", 54);
		Cliente c3 = new Cliente("Carolina Marques", "Vila Real", 27);

		broker.registaUtilizador(c1);
		broker.registaUtilizador(c2);
		broker.registaUtilizador(c3);

		ICamper h1 = broker.registaCamper(p1, 4, "MotorHome com quatro lugares, 3 camas, cozinha, mesa, WC.");
		ICamper h2 = broker.registaCamper(p1, 4, "Camper van com quatro lugares, 2 camas, mesa.");
		ICamper h3 = broker.registaCamper(p2, 2, "Camper van com dois lugares, 1 cama, cozinha, mesa, WC.");
		ICamper h4 = broker.registaCamper(p2, 2, "Tenda de tejadilho para duas pessoas, de montagem rápida.");

		out.println("\nPedido de " + c1 + " para " + h1.getDescricao() + ": Pendente");
		out.println("Pedido de " + c2 + " para " + h3.getDescricao() + ": Pendente");
		out.println("Pedido de " + c3 + " para " + h4.getDescricao() + ": Pendente");

		out.println("\n--- Campers disponivies :");
		for (ICamper camper : broker.getCampersDisponiveis())
			out.println(camper.getDescricao());

		broker.aceitaPedido(c1, h1);
		out.println("\nPedido de " + c1 + " para " + h1.getDescricao() + ": Aceite");
		out.println("Pedido de " + c2 + " para " + h3.getDescricao() + ": Rejeitado");

		out.println("\n--- Campers disponivies :");
		for (ICamper camper : broker.getCampersDisponiveis())
			out.println(camper.getDescricao());

		out.println("Pedido de: " + c3 + " do camper: " + h4.getDescricao() + ": Cancelado");

		out.println("\n--- Campers disponíveis :");
		for (ICamper camper : broker.getCampersDisponiveis())
			out.println(camper.getDescricao());

	}
	/*
	 * private static void alinea3(PrintStream out) {
	 * out.println("\n\nAlínea 3) ----------------------------------\n");
	 * // Completar
	 * }
	 */
}
