package pastryShopKindCakes;

public abstract class AbstractCakeBaby extends AbstractCake {

	protected String nameBaby;

	public AbstractCakeBaby(String name, String description, double cost, int pieces, CakesType type, String nameBaby) {
		super(name, description, cost, pieces, CakesKind.BABY, type);
		setNameBaby(nameBaby);
	}

	private void setNameBaby(String nameBaby) {
		if (nameBaby != null && !nameBaby.isEmpty()) {
			this.nameBaby = nameBaby;
		} else {
			System.out.println("invalid input");
		}
	}

	@Override
	public String toString() {
		return super.toString() + nameBaby + "/ ";

	}

}
