import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.HashMap;
public class GameTest {

    @Test
    public void testYAML() {
        LoadYAML yl = new LoadYAML();
        Room room1 = yl.rooms.get("Starting Room");
        assertEquals(room1.name, "Starting Room");
    }
    @Test
    public void testLockedDoor() {
        GameState state = new GameState("Tester");
        state.room = state.rooms.get("Mystic Room");
        assertFalse(state.room.doors.containsKey("red"));
    }
    @Test
    public void testEndings() {
       GameState state = new GameState("Tester");
       state.inventory.add(state.items.get("key"));
       state.room = state.rooms.get("Secret Chamber");
       assertTrue(state.update().contains("artifact"));
    }
}
