import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarsExample {
    public static void main(String[] args) {
        Motor teslaMotor = new Motor(2.50, "ДВС", Petrol.TYPE4);
        Wheels teslaWheels = new Wheels(13, "175/70 R13", TypeTires.SUMMER);
        Car tesla = new Tesla("Red", 4, 1995, 25000, teslaMotor, teslaWheels, 123123, DriversCategory.B, false, false, "Model Y");

        Motor bmwMotor = new Motor(3.50, "ДВС", Petrol.TYPE6);
        Wheels bmwWheels = new Wheels(15, "160/60 R15", TypeTires.ALL_SEASON);
        Car bmw = new BMW("Black", 4, 2010, 12500, bmwMotor, bmwWheels, 321321, DriversCategory.B1, false, false, "X6");

        Motor ladaMotor = new Motor(4.50, "ДВС", Petrol.TYPE5);
        Wheels ladalaWheels = new Wheels(15, "185/60 R14", TypeTires.WINTER);
        Car lada = new Lada("Grey", 4, 1991, 2500, ladaMotor, ladalaWheels, 111111, DriversCategory.B, false, false, "Vesta");

        Driver driver1 = new Driver("Ivanov Ivan", 5, new DriversCategory[]{DriversCategory.B, DriversCategory.A}, new ArrayList<>(Arrays.asList(321321)));
        Driver driver2 = new Driver("Petrov Petr", 0, new DriversCategory[]{DriversCategory.NONE}, new ArrayList<>());
        Driver driver3 = new Driver("Pavlov pavel", 15, new DriversCategory[]{DriversCategory.A, DriversCategory.B, DriversCategory.B1}, new ArrayList<>(Arrays.asList(321321, 111111, 222222, 123123, 321231)));

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(tesla);
        cars.add(bmw);
        cars.add(lada);
        System.out.println("Информация по авто парка:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Автомобиль №" + (i + 1) + " " + cars.get(i).toString());
        }
        System.out.println("Информация по водителям парка:");
        ArrayList<Driver> drivers = new ArrayList<Driver>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println("Водитель №" + (i + 1) + " " + drivers.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        int myDriver;
        System.out.println("Выберите водителя:");
        myDriver = Integer.parseInt(sc.next());
        int myCar;
        System.out.println("Выберите авто:");
        myCar = Integer.parseInt(sc.next());
        if (myDriver == 1 || myDriver == 2 || myDriver == 3) {
            int ch;
            do {

                System.out.println("Выбрать пункт: ");
                sc = new Scanner(System.in);
// displaying the menu
                System.out.println("1: Открыть и завести автомобиль");
                System.out.println("2: Водить автомобиль");
                System.out.println("3: Принять пассажиров");
                System.out.println("4: Заправить автомобиль");
                System.out.println("5: Выйти из СТО");
                ch = sc.nextInt(); // reading user's choice
                switch (ch) {
                    case 1:
                        if (cars.get(myCar - 1).openCar(drivers.get(myDriver - 1).getDriverPinCode()))
                            System.out.println("Данные по авто: " + cars.get(myCar - 1).toString());
                        else {
                            System.out.println("У водителя отстуствуют ключи для данного автомобиля");
                        }
                        break;

                    case 2:
                        drivers.get(myDriver - 1).drive(cars.get(myCar - 1).getDc());
                        break;
                    case 3:
                        System.out.println("Количество сводобных мест в авто: " + cars.get(myCar - 1).getCarPlaces());
                        int countPassanger;
                        System.out.println("Введите количество пассажиров:");
                        countPassanger = Integer.parseInt(sc.next());
                        int newFreePlaces = drivers.get(myDriver - 1).addPassanger(cars.get(myCar - 1), countPassanger);
                        System.out.println("Количество сводобных мест в авто: " + newFreePlaces);
                        break;
                    case 4:
                        System.out.println("Вы прибыли на заправку. " +
                                "Ваше авто нуждается в топливе " + cars.get(myCar - 1).getMotor().getKindPetrol().getTitle() + " объем двигателя составляет "
                                + cars.get(myCar - 1).getMotor().getVolume() + " л.");
                        System.out.println("На заправке есть топливо следующих видов");
                        List<Petrol> petrolList = Arrays.asList(Petrol.values());
                        petrolList.forEach(petrol -> {
                            System.out.println(petrol);
                        });
                        System.out.println("Введите топливо:");
                        sc = new Scanner(System.in);
                        String petrol = sc.nextLine();
                        cars.get(myCar - 1).reful(petrol);
                        break;
                    case 5:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Некорректный ввод. Введите правильный пункт \n\n");
                }
            }
            while (ch < '1' || ch > '5');
        } else {
            System.out.println("Такого № не существует");

        }
    }
}