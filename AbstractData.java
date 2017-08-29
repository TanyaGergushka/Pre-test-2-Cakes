package pastryShop;

public abstract class AbstractData {

	private String name;
	private String telephone;
	
	public void setName(String name) {
		if (name != null && !name.isEmpty()){
			this.name = name;
		}
		
	}
	public String getName() {
		return name;
	}
	
	public void setTelephone(String telephone) {
		for (int i = 0; i < telephone.length(); i++) {
			if (Character.isDigit(telephone.charAt(i))){
				this.telephone = telephone;
			} else {
				System.out.println("wrong number");
			}
		}
		
	}
	public String getTelephone() {
		return telephone;
	}
}
