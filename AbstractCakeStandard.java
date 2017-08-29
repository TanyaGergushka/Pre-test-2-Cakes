package pastryShopKindCakes;

public abstract class AbstractCakeStandard extends AbstractCake {
	
	protected boolean isSyrupy;

	public AbstractCakeStandard(String name, String description, double cost, int pieces, CakesType type, boolean isSyrupy) {
		super(name, description, cost, pieces, CakesKind.STANDART, type);
		setSyrupy(isSyrupy);
	}

	private void setSyrupy(boolean isSyrupy) {
		this.isSyrupy = isSyrupy;
	}

	

	@Override
	public String toString() {
		return super.toString() + isSyrupy + "/ ";
	}
}
