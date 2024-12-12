import java.util.Locale;

public enum ItemType {
    WEAPON,
    ITEM,
    TOOL,
    MAGIC_ITEM,
    ANIMAL;

    // Method to convert a string to an ItemType
    public static ItemType toType(String str) {
    if (str == null || str.isBlank()) {
        throw new RuntimeException("ItemType cannot be null or empty.");
    }
    try {
        return ItemType.valueOf(str.trim().toUpperCase(Locale.ROOT));
    } catch (IllegalArgumentException e) {
        throw new RuntimeException("Invalid ItemType: '" + str + "'. Valid types are: " + java.util.Arrays.toString(ItemType.values()));
     }
   }
}