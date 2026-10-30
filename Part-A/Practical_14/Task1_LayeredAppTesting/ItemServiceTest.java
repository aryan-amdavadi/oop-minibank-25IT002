import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemServiceTest {
    @Test
    void testAddItemIncreasesCount() {
        ItemService service = new ItemService();
        assertEquals(0, service.getItemCount());
        service.addItem(new Item("I01", "Keyboard", 2500));
        assertEquals(1, service.getItemCount());
    }

    @Test
    void testInvalidItemThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Item("", "Invalid", 100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Item("I02", "Negative", -50);
        });
    }

    @Test
    void testFindById() {
        ItemService service = new ItemService();
        Item item = new Item("I03", "Monitor", 15000);
        service.addItem(item);
        assertEquals(item, service.findById("I03"));
        assertNull(service.findById("NON_EXISTENT"));
    }
}
