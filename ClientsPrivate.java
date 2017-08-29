package pastryShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import pastryShopKindCakes.AbstractCake;

public class ClientsPrivate extends AbstractClient {

	Random ran = new Random();
	private int vaucher;
	private double discount;
	private double moneyForOrder ;

	public ClientsPrivate(String name) {
		super(name);
		vaucher = ran.nextInt(3) + 1;
		for (int i = 0; i < vaucher; i++) {
			discount +=  ran.nextInt(20) + 10;
		}
		
	}

	@Override
	public void setDiscount(double discount) {
		super.setDiscount(discount);
	}

	@Override
	public void setGratuity(double gratuity) {
		super.setGratuity(0.02);
	}

	@Override
	public void makeOrder(CakeShop shop, String adress, ArrayList<AbstractCake> cakes) {
		Supplier supp = shop.returnSupplier();
		Order newOrder = new Order(this, adress, cakes, supp);
		double totalSum = newOrder.getCost() - this.discount;
		double bonus = totalSum * this.getGratuity();

		if (cakes.size() >= 1 && cakes.size() <= 3) {
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

	private void MoneyForOrder(double d) {
		// TODO Auto-generated method stub
		
	}

	public double getMoneyForOrder() {
		return moneyForOrder;
	}

	

}
