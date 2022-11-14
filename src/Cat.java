public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public Boolean eatFood(String foodType) {
        return true;
    }
}
