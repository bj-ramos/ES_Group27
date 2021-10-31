public class Gate {
    private State state;

    public Gate(String s) {
        switch(s) {
            case "opened":
                state = new Opened();
                break;
            case "closed":
                state = new Closed();
                break;
            default:
                System.out.println("Error: unknown state input.");
                return;
        }
        System.out.println("The gate is " + s + ".");
    }

    public void request() {
        state.doAction(this);
    }

    public void setState(State s) {
        state = s;
    }
}
