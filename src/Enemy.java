public class Enemy {

    private int health;

    public void Talk() {
        System.out.println("I am an enemy!");
    }

    public void getHealth() {
        System.out.println(health);
    }

    public void setHealth(int x) {
        health = x;
    }
}
