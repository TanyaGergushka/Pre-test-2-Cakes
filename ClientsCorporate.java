package pastryShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import pastryShopKindCakes.AbstractCake;

public class ClientsCorporate extends AbstractClient {

	double discount = 0.1;
	double moneyForOrder;

	public void setPaidMoney(double paidMoney) {
		this.paidMoney +=  paidMoney;
	}

	public ClientsCorporate(String name) {
		super(name);
		setGratuity(0.05);
	}

	Random ran = new Random();

	@Override
	public void makeOrder(CakeShop shop, String adress, ArrayList<AbstractCake> cakes) {
		Supplier supp = shop.returnSupplier();
		Order newOrder = new Order(this, adress, cakes, supp);
		double totalSum = newOrder.getCost() - (newOrder.getCost()*this.discount);
		double bonus = totalSum * this.getGratuity();

		if (cakes.size() >= 3 && cakes.size() <= 5) {
			shop.sell(cakes);
			this.setPaidMoney(totalSum + bonus);
			this.moneyForOrder = totalSum + bonus;
			supp.addMoneyToSupplier(bonus);
			supp.addOrderToOrderSet(newOrder);
			shop.addMoneyFromSells(totalSum);
				} else {
			System.out.println("Cakes should be between 3 and 5");
		}

	}

	
	

}
