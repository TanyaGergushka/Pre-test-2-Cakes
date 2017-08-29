package pastryShopKindCakes;

public abstract class AbstractCakeSpecial extends AbstractCake {

	protected String event;

	public AbstractCakeSpecial(String name, String description, double cost, int pieces, CakesType type, String avent) {
		super(name, description, cost, pieces, CakesKind.SPECIAL, type);
		setEvent(avent);
	}

	@Override
	public String toString() {
		return super.toString() + event;
	}

	
	private void setEvent(String event) {
		this.event = event;
	}

}
