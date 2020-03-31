public abstract class Aircraft {
    private int id;
    private String model;

    public Aircraft(){}

    public Aircraft(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
