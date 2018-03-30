package animals;

// Parent Class, Abstract class
public class Animal{
    // properties
    private String name;
    private float age;

    // constructor
    public Animal(String name, float age){ 
        this.name = name;
        this.age = age;
    }
    
    // methods
    protected final String getName(){  //final cannot be overwritten by childclasses
        return this.name;
    }
    protected final void changeName(String name){
        this.name = name;
    }
    protected final float getAge(){
        return this.age;
    }
    protected final void changeAge(float age){
        this.age = age;
    }

}