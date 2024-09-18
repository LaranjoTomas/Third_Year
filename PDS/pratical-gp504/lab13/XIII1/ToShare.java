package lab13.XIII1;

import java.util.ArrayList;
import java.util.List;

public class ToShare {

	public List<Product> produtos = new ArrayList<>();
	public List<Product> Sharedprodutos = new ArrayList<>();
	public List<Client> clients_with_items = new ArrayList<>();

	public ToShare(ProductsReader productReader) {
		this.produtos = productReader.getItems();
	}

	public ToShare() {
	}

	public Boolean add(Product item) {
		if (!produtos.contains(item)) {
			produtos.add(item);
			return true;
		}
		return false;
	}

	public List<Product> getProducts() {
		return produtos;
	}

	public Product remove(String code) {
		for (Product p : produtos) {
			if (p.code().equals(code)) {
				produtos.remove(p);
				Sharedprodutos.remove(p);
				return p;
			}
		}
		return null;
	}

	public Product remove(Product p) {
		if (produtos.contains(p) || Sharedprodutos.contains(p)) {
			produtos.remove(p);
			Sharedprodutos.remove(p);
			return p;
		}
		return null;
	}

	public Boolean share(String code, Client user) {
		for (Product p : produtos) {
			if (p.code().equals(code)) {
				produtos.remove(p);
				Sharedprodutos.add(p);
				user.shareItem(p);
				clients_with_items.add(user);
				return true;
			}
		}
		return false;
	}

	public Boolean share(Product p, Client user) {
		if (produtos.contains(p)) {
			produtos.remove(p);
			Sharedprodutos.add(p);
			user.shareItem(p);
			clients_with_items.add(user);
			return true;
		}
		return false;
	}

	public boolean giveBack(String code) {
		for (Product p : Sharedprodutos) {
			if (p.code().equals(code)) {
				Sharedprodutos.remove(p);
				produtos.add(p);

				List<Client> temp_clients = new ArrayList<>();

				for (Client c : clients_with_items) {
					temp_clients.add(c);
				}

				for (Client c : temp_clients) {
					if (c.getItem() != null && c.getItem().equals(p))
						clients_with_items.remove(c);
					c.shareItem(null);
				}

				return true;
			}
		}
		return false;
	}

	public boolean giveBack(Product p) {
		if (Sharedprodutos.contains(p)) {
			Sharedprodutos.remove(p);
			produtos.add(p);

			List<Client> temp_clients = new ArrayList<>();

			for (Client c : clients_with_items) {
				temp_clients.add(c);
			}

			for (Client c : temp_clients) {
				if (c.getItem() != null && c.getItem().equals(p))
					clients_with_items.remove(c);
				c.shareItem(null);
			}

			return true;
		}
		return false;
	}

	public String sharedProducts() {
		String returnstring = "";
		for (Product p : Sharedprodutos) {
			returnstring += p;
			returnstring += "\n";
		}

		return returnstring;
	}

	// for exercise 3
	// void addSubscriber(Client c);
	// void removeSubscriber(Client c);
	// void notifySubscribers();
}
