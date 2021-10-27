public class Main {

    public static void main(String[] args) {
        String o = "opened", c = "closed";

        Gate dor = new Gate(o);

        dor.request();
        dor.request();
        dor.request();
        dor.request();
        dor.request();
        dor.request();
        dor.request();
        dor.request();
        dor.request();

    }
}