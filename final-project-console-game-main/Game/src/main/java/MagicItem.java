import java.util.List;
public class MagicItem extends Item {
    public MagicItem(String name, List<String> types, String desc, String use, String action) {
        super(name, types, desc, use, action);
    }

    @Override
    public void use() {
        System.out.println("The " + this.name + " activates its magical properties: " + this.use);
    }
}