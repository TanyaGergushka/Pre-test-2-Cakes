package pastryShopKindCakes;

import java.util.ArrayList;

public abstract class AbstractCake {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pieces;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (!(obj instanceof AbstractCake)) {
			return false;
		}
		AbstractCake other = (AbstractCake) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (kind != other.kind) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (pieces != other.pieces) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}


	public enum CakesKind{
		BABY, SPECIAL, STANDART, WEDDING;
	}
	public enum CakesType {
		BISKVITENA, EKLEROVA, PLODOVA, SHOCOLADOVA, FIRMENA, REKLAMNA, UBILEINA, GOLQMA, SREDNA, MALKA, KRASHTANE, PROSHTAPUNIK, ROJDENDEN;

		public class BISKVITENA {

		}
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
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	
	public int getPieces() {
		return pieces;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return  "type " + type + " cost " + cost + " pieces " + pieces + ", ";
	}

	public CakesKind getKind() {
		return kind;
	}


	public CakesType getType() {
		return type;
	}

	








//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
//		result = prime * result + ((type == null) ? 0 : type.hashCode());
//		return result;
//	}
//
//
//
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (!(obj instanceof AbstractCake)) {
//			return false;
//		}
//		AbstractCake other = (AbstractCake) obj;
//		if (kind == null) {
//			if (other.kind != null) {
//				return false;
//			}
//		} else if (!kind.equals(other.kind)) {
//			return false;
//		}
//		if (type == null) {
//			if (other.type != null) {
//				return false;
//			}
//		} else if (!type.equals(other.type)) {
//			return false;
//		}
//		return true;
//	}
}
