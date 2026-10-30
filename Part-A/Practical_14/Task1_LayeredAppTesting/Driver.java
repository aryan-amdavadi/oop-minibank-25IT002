public class Driver {
    public static void main(String[] args) {
        ItemService service = new ItemService();
        service.addItem(new Item("IT01", "Laptop", 65000));
        service.addItem(new Item("IT02", "Mouse", 1200));
        System.out.println("Total Items in Inventory: " + service.getItemCount());
        for (Item item : service.getAllItems()) {
            System.out.println(item);
        }
    }
}
