package mulvey;

public class Cruise implements Expense {

    private Destination destination;

    public Cruise (Destination dest) {
        this.destination = dest;
    }

    @Override
    public float getCost() {
        switch (this.destination) {
            case Mexico:
                return 1000;
            case Europe:
                return 2000;
            case Japan:
                return 3000;
            default:
                return 0;
        }
    }
}
