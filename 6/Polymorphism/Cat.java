package animals;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }
    public void sound(){
        System.out.println("meow! meow!");
    }   
}