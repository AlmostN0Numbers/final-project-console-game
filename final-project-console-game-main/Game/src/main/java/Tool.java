import java.util.List;
public class Tool extends Item {
    public Tool(String name, List<String> types, String desc, String use, String action) {
        super(name, types, desc, use, action);
    }

    @Override
    public void use() {
        System.out.println("The " + this.name + " is used. " + this.use);
    }
}