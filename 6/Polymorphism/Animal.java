package animals;


public abstract class Animal{ // abstract class, it object is never gonna made directly
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected final String getName(){
        return this.name;
    }
    protected final void changeName(String n){
        this.name = n;
    }
    protected final int getAge(){
        return this.age;
    }
    protected final void changeAge(int age){
        this.age = age;
    }
    protected abstract void sound(); // abstract method, must be implemented by subclass
}