
/*
   For compiling the package and running it 
   javac -d . *
   java animals.Main

*/


package animals;

public class Main{

    // main
    public static void main(String[] args) {
        Cat cat = new Cat("burpy", 3, "ball");
        System.out.println("/** Cat ** /");
        System.out.println("name : " + cat.getName());
        System.out.println("age : " + cat.getAge());
        System.out.println("FavToy : " + cat.getFavToy());
    }

}