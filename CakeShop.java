package pastryShop;

import java.awt.List;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import java.util.TreeMap;
import java.util.TreeSet;
import pastryShopKindCakes.AbstractCake;
import pastryShopKindCakes.AbstractCake.CakesKind;
import pastryShopKindCakes.AbstractCake.CakesType;

public class CakeShop extends AbstractData {

	private String adress;
	private ArrayList<Supplier> suppliers;
	private TreeMap<CakesKind, TreeMap<CakesType, TreeSet<AbstractCake>>> catalog;
	private double moneyFromSells;
	public static int cakeCount = 0;
	private TreeMap<CakesKind, Integer> sellsCake;

	public CakeShop(String name, String telephone, String adress) {
		super.setName(name);
		super.setTelephone(telephone);
		setAdress(adress);

		suppliers = new ArrayList<Supplier>();

		catalog = new TreeMap<>();
		catalog.put(CakesKind.BABY, new TreeMap<CakesType, TreeSet<AbstractCake>>());
		catalog.put(CakesKind.SPECIAL, new TreeMap<CakesType, TreeSet<AbstractCake>>());
		catalog.put(CakesKind.STANDART, new TreeMap<CakesType, TreeSet<AbstractCake>>());
		catalog.put(CakesKind.WEDDING, new TreeMap<CakesType, TreeSet<AbstractCake>>());

		this.catalog.get(CakesKind.BABY).put(CakesType.KRASHTANE, new TreeSet<AbstractCake>(comparatorByPieces));
		this.catalog.get(CakesKind.BABY).put(CakesType.ROJDENDEN, new TreeSet<AbstractCake>(comparatorByPieces));
		this.catalog.get(CakesKind.BABY).put(CakesType.PROSHTAPUNIK, new TreeSet<AbstractCake>(comparatorByPieces));
		this.catalog.get(CakesKind.SPECIAL).put(CakesType.FIRMENA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.SPECIAL).put(CakesType.UBILEINA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.SPECIAL).put(CakesType.REKLAMNA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.STANDART).put(CakesType.SHOCOLADOVA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.STANDART).put(CakesType.PLODOVA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.STANDART).put(CakesType.EKLEROVA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.STANDART).put(CakesType.BISKVITENA, new TreeSet<AbstractCake>(comparatorByPrice));
		this.catalog.get(CakesKind.WEDDING).put(CakesType.GOLQMA, new TreeSet<AbstractCake>(comparatorByPieces));
		this.catalog.get(CakesKind.WEDDING).put(CakesType.MALKA, new TreeSet<AbstractCake>(comparatorByPieces));
		this.catalog.get(CakesKind.WEDDING).put(CakesType.SREDNA, new TreeSet<AbstractCake>(comparatorByPieces));

		sellsCake = new TreeMap<>();
		sellsCake.put(CakesKind.BABY, 0);
		sellsCake.put(CakesKind.SPECIAL, 0);
		sellsCake.put(CakesKind.STANDART, 0);
		sellsCake.put(CakesKind.WEDDING, 0);
		
	}

	public void addMoneyFromSells(double moneyFromSells) {
		this.moneyFromSells += moneyFromSells;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Supplier returnSupplier() {
		Random ran = new Random();
		int suppIndex = (ran.nextInt(this.suppliers.size() - 1));
		Iterator<Supplier> iter = this.suppliers.iterator();
		for (int i = 0; i < suppIndex; i++) {
			iter.next();
		}
		return iter.next();

	}

	public List getSuppliers() {
		return (List) Collections.unmodifiableList(this.suppliers);
	}

	public void addSupplierToShop(Supplier suppliers) {
		this.suppliers.add(suppliers);
	}

	public double getMoneyFromSells() {
		return moneyFromSells;
	}

	public void sell(ArrayList<AbstractCake> cakes) {

		for (int i = 0; i < cakes.size(); i++) {
			AbstractCake cakess = cakes.get(i);

			for (CakesKind kind : this.catalog.keySet()) {
				if ((this.catalog.get(kind).containsKey(cakess.getType()))) {
					for (CakesType type : this.catalog.get(kind).keySet()) {
						if (type.equals(cakess.getType())) {
							System.out.println("type");
							for (AbstractCake cake : this.catalog.get(kind).get(type)) {
								if (cake.equals(cakess)) {
									switch (cakess.getKind()) {
									case BABY:
										sellsCake.put(CakesKind.BABY, sellsCake.get(CakesKind.BABY)+1);
										break;
									case STANDART:
										sellsCake.put(CakesKind.STANDART, sellsCake.get(CakesKind.STANDART)+1);
										break;
									case SPECIAL:
										sellsCake.put(CakesKind.SPECIAL, sellsCake.get(CakesKind.SPECIAL)+1);
										break;
									case WEDDING:
										sellsCake.put(CakesKind.WEDDING, sellsCake.get(CakesKind.WEDDING)+1);
										break;
									default:
										break;
									}									
									cakeCount--;
									System.out.println("sold");
								}
							}

							// System.out.println(this.catalog.get(kind).get(type).size());
						}

					}
				}
			}
		}
	}

	public void printCatalog() {

		for (CakesKind kind : catalog.keySet()) {
			System.out.println("===================" + kind + "===================");
			for (TreeSet<AbstractCake> cake : catalog.get(kind).values()) {
				System.out.println(cake);
			}
		}
		System.out.println("----------" + cakeCount);
	}

	private Comparator<AbstractCake> comparatorByPrice = new Comparator<AbstractCake>() {

		@Override
		public int compare(AbstractCake o1, AbstractCake o2) {
			if (o1.getCost() > o2.getCost()) {
				return -1;
			}
			return 1;
		}
	};

	private Comparator<AbstractCake> comparatorByPieces = new Comparator<AbstractCake>() {

		@Override
		public int compare(AbstractCake o1, AbstractCake o2) {
			if (o1.getPieces() > o2.getPieces()) {
				return -1;
			}
			return 1;
		}
	};

	public void addCakeToCatalog(AbstractCake cakess) {

		for (CakesKind kind : this.catalog.keySet()) {
			if ((this.catalog.get(kind).containsKey(cakess.getType()))) {
				TreeMap<CakesType, TreeSet<AbstractCake>> entry = this.catalog.get(kind);
				for (CakesType type : entry.keySet()) {
					if (type.equals(cakess.getType())) {
						TreeSet<AbstractCake> cake2 = entry.get(type);
						cake2.add(cakess);
						cakeCount++;
					}
				}
			}
		}
	}

	public TreeSet<Supplier> sortedSuppliers() {
		TreeSet<Supplier> suppSet = new TreeSet<>(new Comparator<Supplier>() {

			@Override
			public int compare(Supplier o1, Supplier o2) {
				if (o1.getMoney() > o2.getMoney()) {
					return -1;
				}
				return 1;
			}
		});
		suppSet.addAll(this.suppliers);
		return suppSet;

	}
	
	public void printSoldCakes (){
	System.out.println();
		for (Entry<CakesKind, Integer> i : sellsCake.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
			
		}
		System.out.println();
	}
	

}
