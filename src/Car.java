import java.util.ArrayList;

abstract public class Car implements Vehicle,Refueled {
    private String carColor;
    private int carPlaces;
    private int carYear;
    private int carPrice;
    //private int carSpeed;
    private Motor motor;
    private Wheels wheels;
    private int carPincode;
    private DriversCategory dc;
    private boolean openedStatus;
    private boolean refuledStatus;


    public Car(String carColor, int carPlaces, int carYear, int carPrice, Motor motor, Wheels wheels, int carPincode, DriversCategory dc, boolean openedStatus, boolean refuledStatus) {
        this.carColor = carColor;
        this.carPlaces = carPlaces;
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.motor = motor;
        this.wheels = wheels;
        this.carPincode = carPincode;
        this.dc = dc;
        this.openedStatus = openedStatus;
        this.refuledStatus = refuledStatus;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPlaces() {
        return carPlaces;
    }

    public void setCarPlaces(int carPlaces) {
        this.carPlaces = carPlaces;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getCarPincode() {
        return carPincode;
    }

    public void setCarPincode(int carPincode) {
        this.carPincode = carPincode;
    }

    public DriversCategory getDc() {
        return dc;
    }

    public void setDc(DriversCategory dc) {
        this.dc = dc;
    }

    public boolean isOpenedStatus() {
        return openedStatus;
    }

    public void setOpenedStatus(boolean openedStatus) {
        this.openedStatus = openedStatus;
    }

    public boolean isRefuledStatus() {
        return refuledStatus;
    }

    public void setRefuledStatus(boolean refuledStatus) {
        this.refuledStatus = refuledStatus;
    }

    @Override
    public String toString() {
        return "+ {" +
                "carColor='" + carColor + '\'' +
                ", carPlaces=" + carPlaces +
                ", carYear=" + carYear +
                ", carPrice=" + carPrice +
                ", motor=" + motor +
                ", wheels=" + wheels +
                ", carPincode=" + carPincode +
                ", dc=" + dc +
                ", openedStatus=" + openedStatus +
                ", refuledStatus=" + refuledStatus+
                '}';
    }

    public boolean openCar(ArrayList<Integer> pins){
     if (pins.contains(carPincode)){
         System.out.println("Авто открыто");
         this.openedStatus = true;
     }
     return openedStatus;
 }
    @Override
    public void reful(String petrol) {
        if (!this.isRefuledStatus()){
            System.out.println("petrol = " + this.getMotor().getKindPetrol().getTitle());
            if(this.getMotor().getKindPetrol().getTitle().equals(petrol)){
                this.setRefuledStatus(true);
                System.out.println("Авто заправлено");
            }
            else{
                System.out.println("Некорректное топливо.. Авто не заправлено.Жди беды :( ");
                this.setRefuledStatus(false);
            }

        }
        else {System.out.println("Авто уже заправлено");}

    }
    public void paintCar(String newColor){
        carColor = newColor;
    }


}
