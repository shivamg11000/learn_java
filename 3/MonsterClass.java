
public class MonsterClass {
    // private properties
    private int attack = 20;
    private int defence = 5;
    private int health = 100;
    private boolean alive = true;

    // public properties
    public String type = "Big Monster";

    // public methods
    public int getAttack(){
        return attack;  // this.attack can also be used
    }
    public int getDefence(){
        return defence;
    }
    public int getHealth(){
        return health;
    }
    public Boolean isDead(){
        return !alive;
    }

    // main function, here it is in MonsterClass , it should be in separate file
    public static void main(String[] args) {
        MonsterClass m = new MonsterClass();
        System.out.println("/*******  Monster  ********/");
        System.out.println("attack : " + m.getAttack());
        System.out.println("defence : " + m.getDefence());
        System.out.println("health : " + m.getHealth());
        System.out.println("Is Dead ");
    }
}
