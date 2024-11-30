import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

public class Driver {
    private String fullName;
    private int drivingExperience;
    private DriversCategory[] driversCategoryList = new DriversCategory[]{};
    private ArrayList<Integer> driverPinCode = new ArrayList<Integer>();

    public Driver(String fullName, int drivingExperience, DriversCategory[] driversCategoryList, ArrayList<Integer> driverPinCode) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
        this.driversCategoryList = driversCategoryList;
        this.driverPinCode = driverPinCode;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DriversCategory[] getDriversCategoryList() {
        return driversCategoryList;
    }

    public void setDriversCategoryList(DriversCategory[] driversCategoryList) {
        this.driversCategoryList = driversCategoryList;
    }

    public ArrayList<Integer> getDriverPinCode() {
        return driverPinCode;
    }

    public void setDriverPinCode(ArrayList<Integer> driverPinCode) {
        this.driverPinCode = driverPinCode;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", driversCategoryList=" + Arrays.toString(driversCategoryList) +
                ", driverPinCode=" + driverPinCode +
                '}';
    }

    public void drive(DriversCategory dc) {
        for (int i = 0; i < driversCategoryList.length; i++) {
            System.out.println(dc);
            if (driversCategoryList[i].equals(dc)) {
                System.out.println("Водитель " + fullName + " может вести данное авто");
                break;
            } else {
                System.out.println("У водителя " + fullName + " нет прав для вождения данного авто");
            }

        }
    }

    public int addPassanger(Car car, int count) {
        int countFreePlaces = car.getCarPlaces();
        if (countFreePlaces > 0 && count <= countFreePlaces) {
            car.setCarPlaces(countFreePlaces - count);
            System.out.println("Добавлено " + count + " пассажиров");
            return car.getCarPlaces();
        } else if (count > countFreePlaces) {
            System.out.println("Ваше авто не резиновое..Можно вместить только "+countFreePlaces+". Остальных на крышу: " + abs(count - countFreePlaces));
            return countFreePlaces;
        }
        return 0;
    }

}
