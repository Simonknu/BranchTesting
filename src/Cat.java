public class Cat extends Animal{


    public Cat(String name){
        super(name);
    }


    @Override
    public void makeSound(){

    }

    @Override
    public boolean eat(String fooType){
        return true;
    }
}

