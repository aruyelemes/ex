public class Helicoper extends Aircraft {
    private int numberOfSeats;

    public Helicoper(int id, String model, int numberOfSeats) {
        super(id, model);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
