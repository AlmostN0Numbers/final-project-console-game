import java.util.List;
import java.util.ArrayList;
public class Item {
    String name;
    ArrayList<ItemType> types = new ArrayList<>();
    String desc;
    String use;
    String action;

    public Item(String name, List<String> types, String desc, String use, String action) {
        this.name = name;
        for (String ty : types) this.types.add(ItemType.toType(ty));
        this.desc = desc;
        this.use = use;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void use() {
        System.out.println("Using the item: " + this.name);
    }
}