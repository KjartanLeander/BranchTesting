public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    public Boolean eatFood(String foodType) {
        return true;
    }
}
