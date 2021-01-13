package mulvey;

public class Lodging implements Expense {

    private int nights;
    private Destination destination;

    public Lodging(Destination dest, int nights) {
        this.nights = nights;
        this.destination = dest;
    }

    @Override
    public float getCost() {
        switch (this.destination) {
            case Mexico:
                return 100 * this.nights;
            case Europe:
                return (float) ((200 * this.nights) * 1.1);
            case Japan:
                return (float) ((300 * this.nights) * 1.3);
            default:
                return 0;
        }
    }
}
