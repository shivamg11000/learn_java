package animals; // files in a package can use each other


// Child class of Animal
public class Cat extends Animal{
    private String favToy;

    public Cat(String name, float age, String favToy){
        super(name, age);
        this.favToy = favToy;
    }

    public String getFavToy(){
        return this.favToy;
    }
    public void changeFavToy(String favToy){
        this.favToy = this.favToy;
    }
    
}