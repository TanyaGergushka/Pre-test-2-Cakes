package pastryShop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import org.w3c.dom.css.Counter;

import pastryShopKindCakes.AbstractCake;
import pastryShopKindCakes.AbstractCake.CakesKind;
import pastryShopKindCakes.AbstractCake.CakesType;
import pastryShopKindCakes.AbstractCake.CakesType.BISKVITENA;
import pastryShopKindCakes.Biskvitena;
import pastryShopKindCakes.Eklerova;
import pastryShopKindCakes.Firmena;
import pastryShopKindCakes.Golqma;
import pastryShopKindCakes.Krashtane;
import pastryShopKindCakes.Malka;
import pastryShopKindCakes.Plodova;
import pastryShopKindCakes.Proshtapulnik;
import pastryShopKindCakes.Reklamna;
import pastryShopKindCakes.RojdenDen;
import pastryShopKindCakes.Shokoladova;
import pastryShopKindCakes.Sredna;
import pastryShopKindCakes.Ubileina;

public class Demo {

	public static void main(String[] args) {

		// create sweetShop /item 1
		CakeShop sweetTalants = new CakeShop("Sweet Talants", "08889995555", "Sofiq, centar 166");

		// create 5 suppliers /item 1
		sweetTalants.addSupplierToShop(new Supplier("Pesho"));
		sweetTalants.addSupplierToShop(new Supplier("Sasho"));
		sweetTalants.addSupplierToShop(new Supplier("Kalin"));
		sweetTalants.addSupplierToShop(new Supplier("Traqn"));
		sweetTalants.addSupplierToShop(new Supplier("Mitko"));
		// System.out.println(CakeShop.suppliers.size());

		// create 30 cakes / item 2
		Random ran = new Random();
		int counter = 0;
		int localcount25 = 0;
		int localcount50 = 0;
		int localcount75 = 0;
		int localcount100 = 0;

		ArrayList<AbstractCake> forOrderFromClients = new ArrayList<>();
		Biskvitena biskvitena12p = new Biskvitena("Biskvitena12", "tasty", 26.5, 12, true);
		Biskvitena biskvitena16p = new Biskvitena("Biskvitena16", "tasty", 29.5, 16, false);
		Plodova plodova12p = new Plodova("Plodova12", "tasty", 30.5, 12, true);
		Plodova plodova16p = new Plodova("Plodova16", "tasty", 36.9, 16, true);
		Shokoladova choco12p = new Shokoladova("choco12", "tasty", 44.0, 16, true);
		Eklerova ekler18p = new Eklerova("ekler18", "tasty", 28.99, 18, false);
		Shokoladova choco16p = new Shokoladova("choco16", "tasty", 48.0, 16, true);
		Shokoladova choco20p = new Shokoladova("choco20", "tasty", 52.0, 20, false);
		Eklerova ekler12p = new Eklerova("ekler12", "tasty", 22.99, 12, true);
		Plodova plodova18 = new Plodova("Plodova18", "tasty", 38.5, 18, true);
		Eklerova ekler16p = new Eklerova("ekler16", "tasty", 25.99, 16, false);
		Shokoladova choco18p = new Shokoladova("choco18", "tasty", 50.0, 18, true);

		Golqma golqma5fl = new Golqma("BigCake5", "tasty", 100.99, 50, 5);
		Sredna sredna3fl = new Sredna("AverageCake3", "tasty", 85.99, 40, 3);
		Golqma golqma7fl = new Golqma("BigCake7", "tasty", 130.99, 70, 7);
		Malka malka3fl = new Malka("SmallCake3", "tasty", 65.99, 30, 3);
		Sredna sredna5fl = new Sredna("AverageCake5", "tasty", 90.99, 50, 5);
		Malka malka2fl = new Malka("SmallCake5", "tasty", 50.99, 25, 2);

		Ubileina ubil40p = new Ubileina("Ubil40", "tasty", 150.25, 55, "25 godini");
		Firmena firmena50p = new Firmena("Company50", "tasty", 169, 60, "45 godini Demo");
		Ubileina ubil30p = new Ubileina("Ubil30", "tasty", 120.25, 45, "30 godini");
		Reklamna reklama45 = new Reklamna("Reklama45", "tasty", 100, 25, "new Ariel");
		Firmena firmena40p = new Firmena("Company40", "tasty", 159, 70, "25 godini Demo");
		Reklamna reklama25 = new Reklamna("Reklama25", "tasty", 60, 15, "new Ariel2");

		RojdenDen rojDen1 = new RojdenDen("RojdenDen1", "tasty", 120, 40, "Dani");
		RojdenDen rojDen2 = new RojdenDen("RojdenDen2", "tasty", 100, 30, "Tanya");
		Krashtane krashtane1 = new Krashtane("Krashtane1", "tasty", 150, 50, "Eli");
		Krashtane krashtane2 = new Krashtane("Krashtane2", "tasty", 160, 40, "Krisi");
		Proshtapulnik bebe1 = new Proshtapulnik("Proshtapulnik1", "tasty", 100, 35, "Emma");
		Proshtapulnik bebe2 = new Proshtapulnik("Proshtapulnik2", "tasty", 120, 40, "Sofyq");

		while (counter < 4) {
			int percent = ran.nextInt(100);
			if (percent < 25) {
				if (localcount25 == 0) {

					sweetTalants.addCakeToCatalog(biskvitena12p);
					forOrderFromClients.add(biskvitena12p);
					sweetTalants.addCakeToCatalog(plodova12p);
					forOrderFromClients.add(plodova12p);
					sweetTalants.addCakeToCatalog(plodova16p);
					forOrderFromClients.add(plodova16p);
					sweetTalants.addCakeToCatalog(biskvitena16p);
					forOrderFromClients.add(biskvitena16p);
					sweetTalants.addCakeToCatalog(choco12p);
					forOrderFromClients.add(choco12p);
					sweetTalants.addCakeToCatalog(ekler18p);
					forOrderFromClients.add(ekler18p);
					sweetTalants.addCakeToCatalog(choco16p);
					forOrderFromClients.add(choco16p);
					sweetTalants.addCakeToCatalog(choco20p);
					forOrderFromClients.add(choco20p);
					sweetTalants.addCakeToCatalog(ekler12p);
					forOrderFromClients.add(ekler12p);
					sweetTalants.addCakeToCatalog(plodova18);
					forOrderFromClients.add(plodova18);
					sweetTalants.addCakeToCatalog(ekler16p);
					forOrderFromClients.add(ekler16p);
					sweetTalants.addCakeToCatalog(choco18p);
					forOrderFromClients.add(choco18p);
					localcount25 = 1;
					counter++;
				}
				continue;

			} else if (percent < 50) {
				if (localcount50 == 0) {
					sweetTalants.addCakeToCatalog(golqma5fl);
					forOrderFromClients.add(golqma5fl);
					sweetTalants.addCakeToCatalog(sredna3fl);
					forOrderFromClients.add(sredna3fl);
					sweetTalants.addCakeToCatalog(golqma7fl);
					forOrderFromClients.add(golqma7fl);
					sweetTalants.addCakeToCatalog(malka3fl);
					forOrderFromClients.add(malka3fl);
					sweetTalants.addCakeToCatalog(sredna5fl);
					forOrderFromClients.add(sredna5fl);
					sweetTalants.addCakeToCatalog(malka2fl);
					forOrderFromClients.add(malka2fl);
					localcount50 = 1;
					counter++;
				}
				continue;

			} else if (percent < 75) {
				if (localcount75 == 0) {
					sweetTalants.addCakeToCatalog(reklama25);
					forOrderFromClients.add(reklama25);
					sweetTalants.addCakeToCatalog(firmena40p);
					forOrderFromClients.add(firmena40p);
					sweetTalants.addCakeToCatalog(ubil40p);
					forOrderFromClients.add(ubil40p);
					sweetTalants.addCakeToCatalog(firmena50p);
					forOrderFromClients.add(firmena50p);
					sweetTalants.addCakeToCatalog(ubil30p);
					forOrderFromClients.add(ubil30p);
					sweetTalants.addCakeToCatalog(reklama45);
					forOrderFromClients.add(reklama45);
					localcount75 = 1;
					counter++;
				}
				continue;

			} else {
				if (localcount100 == 0) {
					sweetTalants.addCakeToCatalog(rojDen1);
					forOrderFromClients.add(rojDen1);
					sweetTalants.addCakeToCatalog(bebe1);
					forOrderFromClients.add(bebe1);
					sweetTalants.addCakeToCatalog(rojDen2);
					forOrderFromClients.add(rojDen2);
					sweetTalants.addCakeToCatalog(krashtane2);
					forOrderFromClients.add(krashtane2);
					sweetTalants.addCakeToCatalog(bebe2);
					forOrderFromClients.add(bebe2);
					sweetTalants.addCakeToCatalog(krashtane1);
					forOrderFromClients.add(krashtane1);
					localcount100 = 1;
					counter++;
				}

			}

		}
		// item 3
		// Creare 5 corporate clients, discounts and vouchers are generated in
		// the constructor
		ArrayList<ClientsCorporate> corporateList = new ArrayList<>();
		corporateList.add(new ClientsCorporate("Corporate client 1"));
		corporateList.add(new ClientsCorporate("Corporate client 2"));
		corporateList.add(new ClientsCorporate("Corporate client 3"));
		corporateList.add(new ClientsCorporate("Corporate client 4"));
		corporateList.add(new ClientsCorporate("Corporate client 5"));

		// Creare 5 private clients, discounts and vouchers are generated in the
		// constructor
		ArrayList<ClientsPrivate> privateList = new ArrayList<>();
		privateList.add(new ClientsPrivate("Private client 1"));
		privateList.add(new ClientsPrivate("Private client 2"));
		privateList.add(new ClientsPrivate("Private client 3"));
		privateList.add(new ClientsPrivate("Private client 4"));
		privateList.add(new ClientsPrivate("Private client 5"));
		// System.out.println(privateList.size());

		System.out.println("***");
		sweetTalants.printCatalog();
		System.out.println("***");

		// item 4

		for (int i = 0; i < corporateList.size(); i++) {
			ArrayList<AbstractCake> order = new ArrayList<>();
			int countCake = ran.nextInt(3) + 3;

			for (int j = 0; j < countCake; j++) {
				int cake = ran.nextInt(forOrderFromClients.size() - 1);
				order.add(forOrderFromClients.get(cake));
			}
			corporateList.get(i).makeOrder(sweetTalants, "Sofiq", order);
			System.out.println("The customer " + corporateList.get(i).getName() + " has paid "
					+ corporateList.get(i).getPaidMoney() + " for: ");
			System.out.println(order);

		}

		for (int i = 0; i < privateList.size(); i++) {
			ArrayList<AbstractCake> order2 = new ArrayList<>();
			int countCake = ran.nextInt(3) + 1;

			for (int j = 0; j < countCake; j++) {
				int cake = ran.nextInt(forOrderFromClients.size() - 1);
				order2.add(forOrderFromClients.get(cake));
			}
			privateList.get(i).makeOrder(sweetTalants, "Plovdiv", order2);
			System.out.println("The customer " + privateList.get(i).getName() + " has paid "
					+ privateList.get(i).getMoneyForOrder() + " for: ");
			System.out.println(order2);

		}
		// Demo item 5
		System.out.println("***");
		sweetTalants.printCatalog();
		System.out.println("***");

		// Demo item 6
		System.out.println("Sweet talants / Money after sales: " + sweetTalants.getMoneyFromSells());

		// Demo item 7
		System.out.println();
		System.out.println("--------------Suppliers------");
		TreeSet<Supplier> sortedSuppliers = sweetTalants.sortedSuppliers();
		for (Supplier supplier : sortedSuppliers) {
			System.out.println(supplier.getName() + " " + supplier.getMoney());
		}
		// Demo item 8
		sweetTalants.printSoldCakes();
		

		// Demo item 9
		TreeSet<Supplier> sortedSupp = new TreeSet<Supplier>(new Comparator<Supplier>() {

			@Override
			public int compare(Supplier o1, Supplier o2) {
				if (o1.getOrderSet().size() > o2.getOrderSet().size()) {
					return -1;
				}
				return 1;
			}
		});
		
		sortedSupp.addAll(sortedSuppliers);
		System.out.println("Supplier with the most orders " + sortedSupp.first().getName());

		System.out.println();
		
		
		// Demo item 10
		TreeSet<AbstractClient> allClients = new TreeSet<>(new Comparator<AbstractClient>() {

			@Override
			public int compare(AbstractClient o1, AbstractClient o2) {
				return (o1.getPaidMoney() > o2.getPaidMoney()) ? -1 : 1;
			}
		});

		allClients.addAll(corporateList);
		allClients.addAll(privateList);
		
		System.out.println("The customer paid the highest amount of cake: " + allClients.first());
		System.out.println(allClients);
		}
}
