package pena.nicolas.ibm.clothesfactory.clothe;

public class Clothe {
	
	private String clotheType;
	private double cost;
	
	public Clothe() {
		
	}

	public Clothe(String clotheType, double cost) {
		super();
		this.setClotheType(clotheType);;
		this.cost = cost;
	}

	public String getClotheType() {
		return clotheType;
	}

	public void setClotheType(String clotheType) {
		if( clotheType.equals("Camisa formal") || clotheType.equals("Pantalon formal") || clotheType.equals("Chaqueta") ) {
			this.clotheType = clotheType;
		} else {
			System.out.println("Error: El producto que busca no se encuentra en nuestra lista de productos.");
		}
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString() {		
		return "\n Producto: " + this.clotheType +
				"\n Costo: " + this.cost;
	}
	

}
