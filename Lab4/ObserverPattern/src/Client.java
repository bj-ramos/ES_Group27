

public class Client {

    protected String clientID;
    protected boolean priority;

    public Client(String clientID){
        this.clientID = clientID;
        this.priority = false;
    }

    public void checkOnOrder(String firstID) {
        if(this.clientID.equals(firstID) ){

            System.out.println("The next order pertains to: " + this.clientID);
        }

    }

    public String getClientID() {
        return this.clientID;
    }

    public boolean getPriority() {
        return this.priority;
    }


}

