public class Opened implements State{

    public Opened(){

    }

    public void doAction(Gate g){
        g.setState(new Closed());
        System.out.println("The gate is now closed.");
    }
}
