public class Dog extends Animal {


    public Dog(String name){
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
