package Taller2;

import java.math.BigDecimal;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		List<Producto> shoppingCart = List.of(new Producto("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Producto("Bread",new BigDecimal("1.5"),Tax.SUPERREDUCED),
				new Producto("Meat", new BigDecimal("13.99"),Tax.REDUCED),
				new Producto("Cheese", new BigDecimal("3.59"),Tax.SUPERREDUCED),
				new Producto("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Producto("Whiskey", new BigDecimal("19.90"),Tax.NORMAL));

		Double suma= shoppingCart.stream().map(s->s.getPrice()).sum();
		System.out.println(suma);
	}

}
