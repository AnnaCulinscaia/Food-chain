//plant   --> grasshopper    --> bluebird         -->snake             -->owl
//producer-->primaty consumer-->secondary consumer -->tertiary consumer -->apex predator
import java.io.*;
class Organism {
    protected String nameOfOrganism;
    public Organism(String name) {
        nameOfOrganism = name;
    }
        public String getName(){
            return nameOfOrganism;
        }
    }


class ApexPredator extends Organism{
    public ApexPredator (String name){
        super(name);
    }
}

class TertiaryConsumer extends ApexPredator{
    public TertiaryConsumer(String name){
        super(name);
    }
}

class SecondaryConsumer extends TertiaryConsumer{
    public SecondaryConsumer(String name){
        super(name);
    }
}

class PrimaryConsumer extends SecondaryConsumer{
    public PrimaryConsumer(String name){
        super(name);
    }
}

class Producer extends PrimaryConsumer{
    public Producer(String name){
        super(name);
    }
}
class MyClass{
    public static void main (String[] args){
        ApexPredator owl = new ApexPredator("Owl");
        TertiaryConsumer snake = new TertiaryConsumer("Snake");
        SecondaryConsumer blueBird = new SecondaryConsumer("Blue Bird");
        PrimaryConsumer grasshopper = new PrimaryConsumer("Grasshopper");
        Producer plant = new Producer("Grass");
        System.out.println(plant.getName()+"-->"+grasshopper.getName()+"-->"+blueBird.getName()
                        +"-->"+snake.getName()+"-->"+owl.getName());

    }
}