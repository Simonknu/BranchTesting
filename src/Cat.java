public class Cat extends Animal{


    public Cat(String name){
        super(name);
    }


    @Override
    public void makeSound(){
        System.out.println("Miau");

    }

    @Override
    public boolean eat(String fooType){
        return true;
    }
}

