import java.util.ArrayList;

public class Tesla  extends Car{
    private String model;

    public Tesla(String carColor, int carPlaces, int carYear, int carPrice, Motor motor, Wheels wheels, int carPincode, DriversCategory dc, boolean openedStatus, boolean refuledStatus, String model) {
        super(carColor, carPlaces, carYear, carPrice, motor, wheels, carPincode, dc, openedStatus, refuledStatus);
        this.model = model;
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }

    public void start() {
        System.out.println("The Tesla car is going very fast");
    }

    @Override
    public void stop() {
        System.out.println("The Tesla car completed moving");
    }

    @Override
    public double mpg(double miles, double gallons) {
        return (miles/gallons);
    }

    @Override
    public void carInspection() {
        System.out.println("Tesla Inspection is done");
    }

    @Override
    public void tireType(int year, String model, TypeTires tt) {
        System.out.println("LADA Tesla "+model+ "year "+year+" has "+tt.ALL_SEASON+" tire");
    }
    @Override
    public boolean carCategoryDriver() {
        return false;
    }

    @Override

    public boolean openCar(ArrayList<Integer> pins){
        if (pins.contains(super.getCarPincode())){
            System.out.println("Tesla "+model+" открыто");
            super.setOpenedStatus(true);
            start();
        }
        return  super.isOpenedStatus();
    }
}
