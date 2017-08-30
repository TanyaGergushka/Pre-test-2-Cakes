package pastryShopKindCakes;

import java.util.ArrayList;

public abstract class AbstractCake implements Comparable<AbstractCake> {

	public enum CakesKind {
		BABY, SPECIAL, STANDART, WEDDING;
	}

	public enum CakesType {
		BISKVITENA, EKLEROVA, PLODOVA, SHOCOLADOVA, FIRMENA, REKLAMNA, UBILEINA, GOLQMA, SREDNA, MALKA, KRASHTANE, PROSHTAPUNIK, ROJDENDEN;

	}

	protected String name;
	protected String description;
	protected double cost;
	protected int pieces;
	protected CakesKind kind;
	protected CakesType type;

	public AbstractCake(String name, String description, double cost, int pieces, CakesKind kind, CakesType type) {
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.pieces = pieces;
		this.kind = kind;
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public int getPieces() {
		return pieces;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "type " + type + " cost " + cost + " pieces " + pieces + ", ";
	}

	public CakesKind getKind() {
		return kind;
	}

	public CakesType getType() {
		return type;
	}

	@Override
	public int compareTo(AbstractCake o) {
		if (this.getCost() == o.getCost()) {
			return 0;
		} else {
			return (int) (this.getCost() - o.getCost());
		}
	}
}
