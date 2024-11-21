public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Alberto");
        Cat cat = new Cat("Rodolfo");
        dog.makeSound();
        cat.makeSound();

        dog.eat("dogfood");
        cat.eat("fish");

        dog.showMood(true);
        cat.showMood(false);

    }
}
