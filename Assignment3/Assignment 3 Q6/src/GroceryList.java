import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private int size;

    public GroceryList() {
        items = new ArrayList<>();
        size = 0;
    }

    public void add(GroceryItemOrder item) {
        if (size < 10) {
            items.add(item);
            size++;
        } else {
            System.out.println("Grocery list is full!");
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<GroceryItemOrder> getItems() {
        return items;
    }
}
