public class Dog extends Animal {


    public Dog(String name){
        super(name);
    }


    @Override
    public void makeSound(){
        System.out.println("Wuf");

    }
    @Override
    public boolean eat(String fooType){
        return true;
    }
}
