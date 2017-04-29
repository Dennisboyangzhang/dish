package dish;

enum DishType {
    Starter,
    Entree,
    Dessert,
    Drink,
    Vegtarian,
    Kids
}

public class Dish {
	String name;
	String description = "";
	String price = "0";
	String category;
	String section;
        Location restaurantLocation;
        String restaurantName;
        String restaurantId;
        DishType type;
	
	public Dish (SingleDish dish, String cat, String sec) {
		name = dish.name;
		description = dish.description;
		price = dish.price;
		category = cat;
		section = sec;
                type = DishType.Entree;
                if (section.matches("(.*)Starter(.*)")
                        || section.matches("(.*)Appetizer(.*)")
                        || section.matches("(.*)Small Plates(.*)")
                        || section.matches("(.*)Soups(.*)")
                        || section.matches("(.*)Salads(.*)")) {
                    type = DishType.Starter;
                } else if (section.matches("(.*)Dessert(.*)")
                        || category.matches("(.*)Dessert(.*)")
                        || section.matches("(.*)Sweet(.*)")
                        || category.matches("(.*)Sweet(.*)")) {
                    type = DishType.Dessert;
                } else if (section.matches("(.*)Drink(.*)")
                        || section.matches("(.*)Beverage(.*)")
                        || section.matches("(.*)Juice(.*)")
                        || section.matches("(.*)Soda(.*)")
                        || section.matches("(.*)Tea(.*)")
                        || section.matches("(.*)Wine(.*)")
                        || section.matches("(.*)Beer(.*)")
                        || section.matches("(.*)Cocktail(.*)")
                        || category.matches("(.*)Beverage(.*)")
                        || category.matches("(.*)Cocktail(.*)")
                        || category.matches("(.*)Sake(.*)")
                        || category.matches("(.*)Wine(.*)")
                        || category.matches("(.*)Drink(.*)")) {
                    type = DishType.Drink;
                } else if (section.matches("(.*)Vegetarian(.*)")
                        || section.matches("(.*)Vegan(.*)")
                        || category.matches("(.*)Vegetarian(.*)")
                        || category.matches("(.*)Vegan(.*)")) {
                    type = DishType.Vegtarian;
                } else if (section.matches("(.*)Kids(.*)")
                        || category.matches("(.*)Kids(.*)")) {
                    type = DishType.Kids;
                }
	}
        
        public String getName(){
            return name;
        }
        
        public void whichRestaurant(Restaurant r) {
            restaurantName = r.getName();
            restaurantId = r.getId();
            restaurantLocation = r.getLocation();
        }
       
	
	public String toString () {
            return String.format("%s\t$%s\t%s\t\t%s\t%s\n", name, price, type, category, section);
//            return String.format("%s\t$%s\t%s\t%s\n", name, price, category, section);
//		return String.format("%s  $%s \n%s\n", name, price, location);
	}
}
