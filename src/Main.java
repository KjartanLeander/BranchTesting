public class Main {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

        cat.eat("dogfood");
        dog.eat("catfood");

        dog.showMood(true);
        dog.showMood(false);

        cat.showMood(true);
        cat.showMood(false);

    }
}
