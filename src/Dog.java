public class Dog extends Animal {


    public Dog(String name){
        super(name);
    }


    @Override
    public void makeSound(String sound){
        System.out.println(sound);

    }
}
