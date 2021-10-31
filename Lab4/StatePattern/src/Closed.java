public class Closed implements State{

    public Closed(){

    }

    public void doAction(Gate g){
        g.setState(new Opened());
        System.out.println("The gate is now opened.");
    }
}