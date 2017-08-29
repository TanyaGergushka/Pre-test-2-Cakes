package pastryShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Supplier extends AbstractData{
	
	
	public  double money;
	public TreeSet<Order> orderSet;

	public Supplier(String name) {
		setName(name);
		orderSet = new TreeSet<>(new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {
				if (o1.getClient().equals(o2.getClient()) && o1.getAdress().equals(o2.getAdress())){
				if (o1.getTimeDelivery().equals(o2.getTimeDelivery())){
					return 0;
				}
				}
				return 1;
			}
		});
	}
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public void setTelephone(String telephone) {
		super.setTelephone(telephone);
	}
	
	 public  void addMoneyToSupplier(double money) {
		this.money += money;
	}

	 public double getMoney() {
		return money;
	}
	 
	
		 public Set<Order> getOrderSet() {
			return Collections.unmodifiableSet(orderSet);
		}
		public void addOrderToOrderSet(Order order) {
			this.orderSet.add(order);
		}
}
