import java.util.*;
// Tracks global game state
// Useful for implementing state-based behavior (ex: see something new on second visit to room)

public class GameState {
    HashMap<Room, Boolean> visited = new HashMap<Room, Boolean>();
    String name;
    boolean finished;
    Room room;
    List<Item> inventory = new ArrayList<Item>();
    Map<String, Room> rooms; // global list of rooms
    Map<String, Item> items; // global list of known items

    // update state and check for winning condition
    public String update() {
        if (room.name.equals("Secret Chamber") && inventory.contains(items.get("key"))) {
           finished = true;
           return "You unlock the ancient chest in the Secret Chamber. Inside, you find a glowing artifact. The artifact transports you back to the library. You feel a sense of accomplishment and wonder.";
        }
        if (room.contents.contains(items.get("poison frog")) &&
            room.contents.contains(items.get("book")) ){
            finished = true;
            System.out.println(
            "The frog hops slowly over to the book and hops on top. Suddenly the book and the frog begin to glow. The room starts spinning and you shut your eyes out of fear. When you open them, you're back in the original basement room! When you open the door, you find yourself back in the modern-day library. As you leave and the door swings shut, you think you hear a faint \"ribbet\"....");
        }
        if (room.name.equals("Secret Chamber") && inventory.contains(items.get("key"))) {
           finished = true;
           System.out.println(
              "You unlock the ancient chest in the Secret Chamber. Inside, you find a glowing artifact. " +
              "The artifact transports you back to the library. You feel a sense of accomplishment and wonder.");
        }
        return "";      
    }
    public GameState(String name) {
        this.name = name;
        finished = false;
        LoadYAML yl = new LoadYAML();
        rooms = yl.rooms;
        items = yl.items;
        room = rooms.get("Starting Room");
        visited.put(room, true);
        inventory.add(items.get("book"));
    }
}
