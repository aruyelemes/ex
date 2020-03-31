import static java.lang.Math.log;

public class Airplane extends Aircraft implements Comparable<Airplane> {
    private int fuelConsumption;
    private double fuelTank;
    private int passengers;

    public Airplane(){}

    public Airplane(int id, String model, int fuelConsumption, double fuelTank, int passengers) {
        super(id, model);
        this.fuelConsumption = fuelConsumption;
        this.fuelTank = fuelTank;
        this.passengers = passengers;
    }

    public int calculatrFuelTank(){
        return getId() * 200;
    }

    public double calculateFuelConsumption(){
        return log(getId() * 0.8);
    }

    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int passengers){
        this.passengers=passengers;
    }

    public double totalFuelConsumption(){
        return calculateFuelConsumption() + passengers * (calculateFuelConsumption()*0.02);
    }

    public double maxFlyingTime(){
        return fuelTank / fuelConsumption;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelConsumption=" + fuelConsumption +
                ", fuelTank=" + fuelTank +
                ", passengers=" + passengers +
                '}';
    }

    @Override
    public int compareTo(Airplane o) {
        return 0;
    }
}
