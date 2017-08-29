package pastryShopKindCakes;

public abstract class AbstractCakeWedding extends AbstractCake {
	
	protected int slice;
	
	public AbstractCakeWedding(String name, String description, double cost, int pieces,CakesType type, int slice) {
		super(name, description, cost, pieces, CakesKind.WEDDING, type);
		setSlice(slice);
	}

	private void setSlice(int slice) {
		if (slice > 0){
			this.slice = slice;
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString() + slice + "/ ";
	}
}
