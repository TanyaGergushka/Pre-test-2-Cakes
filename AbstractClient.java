package pastryShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import pastryShop.Supplier;
import java.util.Random;

import pastryShopKindCakes.AbstractCake;

public abstract class AbstractClient extends AbstractData {

	private double discount;
	private double gratuity;
	double sumOrder = 0;
	protected double paidMoney;

	public AbstractClient(String name) {
		super.setName(name);
	}

	protected void setDiscount(double discount) {
		this.discount = discount;
	}

	protected double getDiscount() {
		return discount;
	}

	protected double getGratuity() {
		return gratuity;
	}

	@Override
	public String toString() {
		return this.getName() +  ", paidMoney=" + paidMoney + "\n" ;
	}

	protected void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}

	protected void setPaidMoney(double paidMoney) {
		this.paidMoney += paidMoney;
	}

	protected double getPaidMoney() {
		return paidMoney;
	}

	abstract void makeOrder(CakeShop shop, String adress, ArrayList<AbstractCake> cake);
	
	

	
}
