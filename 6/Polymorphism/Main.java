/** 
     javac -d . *
     java animals.Main
**/

package animals;

public class Main{
    public static void main(String[] args) {

        Animal tom = new Cat("tom", 2);  // every cat is an animal
        printDetails(tom);
    }

    public static void printDetails(Animal animal){
        if (animal instanceof Animal) {
            System.out.println("Name : " + animal.getName());
            System.out.println("Age : " + animal.getAge());
            System.out.print(animal.getName() + " does " );
            animal.sound(); // polymorphism displayed here
        }
    }
}