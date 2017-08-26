package hello;

public enum Fruits {
    BANANA, STRAWBERRY, APPLE, PEAR;


    public static boolean isFruitName(String name) {
        Fruits[] fruits = Fruits.values();
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].name().equals(name)) {
                return true;
            }

        }
        return false;
    }
}
