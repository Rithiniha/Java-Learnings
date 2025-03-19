package restraunt;
import java.util.*;

class Recipe{
	String Dish;
	String Quant;
	int price;

void Display() {
	System.out.println("My Drink : "  + Dish);
	System.out.println("Quantity : "+Quant);
	System.out.println("Price : "+price);
}
}

public class Restraunt {

	public static void main(String[] args) {
		Recipe rec = new Recipe();
		rec.Dish = "Cocktail";
		rec.Quant="200 ml";
		rec.price=350;
rec.Display();	}

}
