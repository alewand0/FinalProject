/**
* Character Class 
* Elements Game by Aiden Lewandowski.
*/

public class Character {
    private String name;
    private int damage;
    private String element;
    private int health;

    public Character(String name, int damage, String element, int health) {
        this.name = name;
        this.damage = damage;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int d) {
        this.damage = d;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int h) {
        this.health = h;
    }
    
        public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }


    public String elementorder() {
        if (element.equalsIgnoreCase("Fire")) {
            return "\nInfo: Fire has boosted damage against Air";
        } else if (element.equalsIgnoreCase("Water")) {
            return "\nInfo: Water has boosted damage against Fire";
        } else if (element.equalsIgnoreCase("Earth")) {
            return "\nInfo: Earth has boosted damage against Water";
        } else {
            return "\nInfo: Air has boosted damage against Earth";
        }
    }

}

