public class Pokemon {

    String name;
    int level;
    int damage;

    Pokemon() {
        name = "default";
        level = 1;
        damage = 1;
    }

    Pokemon(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.damage = level*power;
    }

    void Attack() {
        System.out.println("The pokemon %s with level %s, attacked with damage: %s".formatted(name, level, damage));
    }

}
