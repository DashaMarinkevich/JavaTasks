import java.util.ArrayList;

public class Lada  extends Car{
    private String model;

    public Lada(String carColor, int carPlaces, int carYear, int carPrice, Motor motor, Wheels wheels, int carPincode, DriversCategory dc, boolean openedStatus, boolean refuledStatus, String model) {
        super(carColor, carPlaces, carYear, carPrice, motor, wheels, carPincode, dc, openedStatus, refuledStatus);
        this.model = model;
    }


    @Override
    public void start() {
        System.out.println("The LADA car won't start");
    }


    @Override
    public void stop() {
        System.out.println("The LADA car completed moving");
    }

    @Override
    public double mpg(double miles, double gallons) {
        return (miles/gallons);
    }

    @Override
    public void carInspection() {
        System.out.println("LADA Inspection is done");
    }

    @Override
    public void tireType(int year, String model, TypeTires tt) {
        System.out.println("LADA Model "+model+ "year "+year+" has "+tt.ALL_SEASON+" tire");
    }
    @Override
    public boolean carCategoryDriver() {
        return false;
    }


    @Override
    public String toString() {
        return "Lada{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
    public boolean openCar(ArrayList<Integer> pins){
        if (pins.contains(super.getCarPincode())){
            System.out.println("Tesla "+model+" открыто");
            super.setOpenedStatus(true);
            start();
        }
        return  super.isOpenedStatus();
    }
}
