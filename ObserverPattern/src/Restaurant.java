import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Client> waitingQueue;

    public Restaurant() {
       waitingQueue =  new ArrayList<>();

    }

    public void addClient(Client client) {
        if(client.getPriority()) {
            waitingQueue.add(0,client);
        } else {
            waitingQueue.add(client);
        }

    }

    public void removeClient() {
        waitingQueue.remove(0);
    }

    public void notifyClient() {
        for (Client c: waitingQueue) {
            c.checkOnOrder(waitingQueue.get(0).getClientID());
        }
    }
}
