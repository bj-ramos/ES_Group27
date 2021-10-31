public class TakeawayClient extends Client{

    public TakeawayClient(String clientID) {
        super(clientID);
        this.priority = true;
    }
}
