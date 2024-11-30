import java.util.ArrayList;

public class BMW extends Car  {

    private String model;

    public BMW(String carColor, int carPlaces, int carYear, int carPrice, Motor motor, Wheels wheels, int carPincode, DriversCategory dc, boolean openedStatus, boolean refuledStatus, String model) {
        super(carColor, carPlaces, carYear, carPrice, motor, wheels, carPincode, dc, openedStatus, refuledStatus);
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The BMW car started moving");
    }

    @Override
    public void stop() {
        System.out.println("The BMW car completed moving");
    }

    @Override
    public double mpg(double miles, double gallons) {
        return (miles/gallons);
    }

    @Override
    public void carInspection() {
        System.out.println("BMW Inspection is done");
    }

    @Override
    public void tireType(int year, String model, TypeTires tt) {
        System.out.println("BMW Model "+model+ "year "+year+" has "+tt.WINTER+" tire");
    }
    @Override
    public boolean carCategoryDriver() {
        return false;
    }
    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }


    public boolean openCar(ArrayList<Integer> pins){
        if (pins.contains(super.getCarPincode())){
            System.out.println("BMW "+model+" открыто");
            super.setOpenedStatus(true);
            start();
        }
        return  super.isOpenedStatus();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
