import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        GroceryList list = new GroceryList();
        System.out.print("Enter the name of the item: ");
        String name = input.nextLine();

        System.out.print("Enter the price per unit: ");
        double pricePerUnit = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();


        GroceryItemOrder item = new GroceryItemOrder(name, pricePerUnit);
        item.setQuantity(quantity);


        list.add(item);


        System.out.println("Total cost: $" + list.getTotalCost());

        System.out.println("Grocery List:");
        for (GroceryItemOrder groceryItem : list.getItems()) {
            System.out.println(groceryItem.getQuantity() + " " + groceryItem.getName() + " @ $" + groceryItem.getPricePerUnit() + " = $" + groceryItem.getCost());
        }
    }
}
