import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null");
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public Item findById(String id) {
        return items.stream()
                .filter(i -> i.id().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public List<Item> getAllItems() {
        return new ArrayList<>(items);
    }
}
