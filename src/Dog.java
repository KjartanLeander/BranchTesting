public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    public Boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood==true)
            System.out.println("Logrer");
        else
            System.out.println("Knurrer");
    }
}
