

public class Main {
    public static void main(String[] args) {
        Restaurant newRest = new Restaurant();

        Client dude1 = new IndoorsClient("Ze Manel");
        Client dude2 = new IndoorsClient("Pedro Jorge");
        Client dude3 = new TakeawayClient("Zeca Afonso");
        Client dude4 = new IndoorsClient("Mr Oliveira");
        Client dude5 = new TakeawayClient("Honesta Mente");
        Client dude6 = new TakeawayClient("Administra Dor");

        newRest.addClient(dude1);
        newRest.addClient(dude2);
        newRest.addClient(dude3);
        newRest.addClient(dude4);
        newRest.addClient(dude5);
        newRest.addClient(dude6);


        newRest.notifyClient();
        newRest.removeClient();
        newRest.notifyClient();

        newRest.removeClient();
        newRest.notifyClient();
        newRest.removeClient();
        newRest.notifyClient();
        newRest.removeClient();
        newRest.notifyClient();
        newRest.removeClient();
        newRest.notifyClient();




    }
}
