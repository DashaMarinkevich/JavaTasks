public interface Vehicle {

    public void start();

    public void stop();

    public double mpg(double miles, double gallons);

    public abstract void carInspection();

    public abstract void tireType(int year, String model,TypeTires tt);

    public abstract boolean carCategoryDriver();

}
