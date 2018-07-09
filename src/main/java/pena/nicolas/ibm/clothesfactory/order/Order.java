package pena.nicolas.ibm.clothesfactory.order;

import java.util.Date;

import pena.nicolas.ibm.clothesfactory.clothe.Clothe;

public class Order {
	
	private String companyname;
	private String productServiceDescription;
	private String formName;
	private String requestorName;
	private String idType;
	private String idNummber;
	private Clothe clothesType;
	private int productQuantity;
	private Date deliveryDate;
	private String deliveryAddress;
	private double totalCost;
	
	
	
	public Order() {
		
	}
	
	public Order(String companyname, String productServiceDescription, String formName, String requestorName,
			String idType, String idNummber, Clothe clothesType, int productQuantity, Date deliveryDate,
			String deliveryAddress) {
		super();
		this.setProductQuantity(productQuantity);
		this.setTotalCost(clothesType);
		
		this.companyname = companyname;
		this.productServiceDescription = productServiceDescription;
		this.formName = formName;
		this.requestorName = requestorName;
		this.idType = idType;
		this.idNummber = idNummber;
		this.clothesType = clothesType;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
		
	}
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getProductServiceDescription() {
		return productServiceDescription;
	}
	public void setProductServiceDescription(String productServiceDescription) {
		this.productServiceDescription = productServiceDescription;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getRequestorName() {
		return requestorName;
	}
	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNummber() {
		return idNummber;
	}
	public void setIdNummber(String idNummber) {
		this.idNummber = idNummber;
	}
	public Clothe getClothesType() {
		return clothesType;
	}
	public void setClothesType(Clothe clothesType) {
		this.clothesType = clothesType;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		if(productQuantity <= 5) {
			this.productQuantity = productQuantity;
		} else {
			System.out.println("Error: No puede seleccionar mas de cinco productos por formulario.");
		}
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Clothe product) {
		this.totalCost = product.getCost() * this.productQuantity;
	}
	
	public String toString() {
		String msg = "";
		msg += "\nNombre de la microempresa: " + this.companyname +
				"\nDescripcion del servicio de pedido: " + this.productServiceDescription + 
				"\nNombre del formulario: " + this.formName +
				"\nNombre del solicitante: " + this.requestorName + 
				"\nTipo de identificacion: " + this.idType +
				"\nNumero de identificacion: " + this.idNummber +
				"\nProductos: " + this.clothesType +
				"\nCantidad de productos: " + this.productQuantity +
				"\nFecha de la entrega:" + this.deliveryDate + 
				"\nDireccion de entrega: " + this.deliveryAddress + 
				"\nCosto total: " + this.totalCost +
				"\n\nEl precio del transporte no está incluido y dependerá del lugar de entrega, "
				+ "este se deberá cancelar junto con el valor del pedido en el momento de la entrega.";
		
		return msg;
	}

}
