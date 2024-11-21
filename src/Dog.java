public class Dog extends Animal {


    public Dog(String name){
        super(name);
    }


    @Override
    public void makeSound(){
        System.out.println("Güau");

    }
    @Override
    public boolean eat(String fooType){
        return true;
    }
}
