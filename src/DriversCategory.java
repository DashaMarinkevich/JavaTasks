public enum DriversCategory {
    A ("Motorcycle"),
    B ("Cars"),
    C ("Truck"),
    M("Scooter"),
    B1 ("Quadricycle"),
    A1 ("MotorcycleLight"),
    NONE ("None");
    private String category;

    DriversCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
