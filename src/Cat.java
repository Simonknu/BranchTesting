public class Cat extends Animal{


    public Cat(String name){
        super(name);
    }


    @Override
    public void makeSound(String sound){
        System.out.println(sound);

    }

    @Override
    public boolean eat(String fooType){
        return true;
    }
}

