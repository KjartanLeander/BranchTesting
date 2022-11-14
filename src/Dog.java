public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    public Boolean eat(String foodType) {
        return true;
    }
}
