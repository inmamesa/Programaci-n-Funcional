package Taller2;

import java.math.BigDecimal;

public class Producto {
	public String name;
	public BigDecimal price;
	
	Producto(String name, BigDecimal price, Tax tax)
	{
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}

enum Tax{
	SUPERREDUCED(4),REDUCED(10), NORMAL(21);
	public int percent;
	private Tax(int percet) {this.percent=percent;}
	public int getPercent() {return percent;}
}
