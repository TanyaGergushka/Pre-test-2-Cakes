package pastryShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

import pastryShopKindCakes.AbstractCake;

public class Order {

	private AbstractClient client;
	private double cost;
	private String adress;
	private ArrayList<AbstractCake> orderCakes = new ArrayList<>();
	private LocalDateTime timeDelivery;
	private Supplier supplier;

	public Order(AbstractClient client, String adress, ArrayList<AbstractCake> orderCakes, Supplier supplier) {

		setClient(client);
		this.cost = calculateCostOrder(orderCakes);
		setAdress(adress);
		this.orderCakes = orderCakes;
		setTimeDelivery();
		this.supplier = supplier;
	}

	public double getCost() {
		return cost;
	}

	

	private void setAdress(String adress) {
		if (adress != null && !adress.isEmpty()) {
			this.adress = adress;
		}
	}

	private void setClient(AbstractClient client) {
		if (client != null) {
			this.client = client;
		}
	}

	private double calculateCostOrder(ArrayList<AbstractCake> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getCost();
		}
		return sum;

	}

	
	private void setTimeDelivery() {
		this.timeDelivery = LocalDateTime.now().plusDays(2);
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((timeDelivery == null) ? 0 : timeDelivery.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		if (timeDelivery == null) {
			if (other.timeDelivery != null) {
				return false;
			}
		} else if (!timeDelivery.equals(other.timeDelivery)) {
			return false;
		}
		return true;
	}

	public AbstractClient getClient() {
		return client;
	}

	public String getAdress() {
		return adress;
	}

	public LocalDateTime getTimeDelivery() {
		return timeDelivery;
	}

	

	

}
