package mulvey;

public class Dining implements Expense {

    private int nights;
    private Destination destination;

    public Dining(Destination dest, int nights) {
        this.nights = nights;
        this.destination = dest;
    }

    @Override
    public float getCost() {
        switch (this.destination) {
            case Mexico:
                return 10 * this.nights;
            case Europe:
                return 20 * this.nights;
            case Japan:
                return 30 * this.nights;
            default:
                return 0;
        }
    }
}
