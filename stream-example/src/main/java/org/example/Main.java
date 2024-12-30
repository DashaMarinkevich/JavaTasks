package org.example;

import org.example.model.*;
import org.example.util.Util;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) throws IOException {
        // task1();
        // task2();
        // task3();
        // task4();
        //task5();
        // task6();
        // task7();
        //task8();
        //task9();
        //task10();
        // task11();
        //task12();
        task13();
        // task14();
        // task15();
    }

    private static void task1() throws IOException {
        List<Animal> animals = Util.getAnimals();

        Comparator<Animal> comparator = Comparator.comparingInt(Animal::getAge);
        animals.stream()
                .filter(animal -> animal.getAge() > 10 && animal.getAge() < 20)
                .sorted(comparator)
                .skip(2 * 7)
                .limit(7)
                .forEach(System.out::println);
    }

    private static void task2() throws IOException {
        List<Animal> animals = Util.getAnimals();
        List<String> filteredAnimal = animals
                .stream()
                .filter(animal -> "Japanese".equals(animal.getOrigin()))
                .map(animal -> "Female".equalsIgnoreCase(animal.getGender()) ? animal.getBread().toUpperCase() : animal.getBread())
                .collect(Collectors.toList());
        for (int i = 0; i < filteredAnimal.size(); i++) {
            System.out.println(filteredAnimal.get(i).toString());
        }
    }

    private static void task3() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Вывод всех стран происхождения животных старше 30 лет, которые начинаются на A:");
        animals.stream()
                .filter(animal -> animal.getAge() > 30)
                .map(animal -> animal.getOrigin())
                .distinct()
                .filter(s -> "a".equalsIgnoreCase(String.valueOf(s.charAt(0))))
                .forEach(System.out::println);
    }

    private static void task4() throws IOException {
        List<Animal> animals = Util.getAnimals();
        long count = animals.stream()
                .filter(animal -> "Female".equals(animal.getGender()))
                .count();
        System.out.println("Количество животных женского пола = " + count);
    }

    private static void task5() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Поиск всех животных возрастом 20 - 30 лет.И проверка есть ли среди них хоть один из Hungarian");
        Optional<Animal> any = animals.stream()
                .filter(animal -> animal.getAge() >= 20 && animal.getAge() <= 30)
                .filter(animal -> "Hungarian".equals(animal.getOrigin()))
                .findAny();
        System.out.println(any.isEmpty() ? "Нет таких животных" : "Животные есть. Например " + any.get().toString());
    }

    private static void task6() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Все ли они животные полов Male и Female?");
        boolean a = animals.stream()
                .allMatch(animal -> "Female".equalsIgnoreCase(animal.getGender()) || "Male".equalsIgnoreCase(animal.getGender()));
        System.out.println(a);
    }

    private static void task7() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Проверка:Отсутсвуют животные, которые имеют страну происхождения Oceania?");
        boolean b = animals.stream()
                .noneMatch(animal -> "Oceania".equals(animal.getOrigin()));
        System.out.println(b);
    }

    private static void task8() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Отсортировать животных по породе в стандартном порядке и взять первые 100.\n" +
                "Вывести в консоль возраст самого старого животного");
        // что значит стандартный порядок, если таких животных несколько?
        int age =
                animals.stream()
                        .sorted(Comparator.comparingInt(Animal::getAge).reversed())
                        .limit(100)
                        .findFirst()
                        .get()
                        .getAge();
        System.out.println("Возраст = " + age);
    }

    private static void task9() throws IOException {
        List<Animal> animals = Util.getAnimals();
        System.out.println("Преобразовать животных в породы, а породы в []char");
        OptionalInt first =
                animals.stream()
                        .map(animal -> animal.getBread())
                        .map(s -> s.toCharArray())
                        .mapToInt(n -> n.length)
                        .sorted()
                        .findFirst();

        System.out.println("Длина самого короткого массива = " + first.getAsInt());
    }

    private static void task10() throws IOException {
        List<Animal> animals = Util.getAnimals();
        int sum = animals.stream()
                .mapToInt(animal -> animal.getAge())
                .sum();
        System.out.println("Суммарный возраст всех животных = " + sum);
    }

    private static void task11() throws IOException {
        List<Animal> animals = Util.getAnimals();
        OptionalDouble average = animals
                .stream()
                .filter(animal -> "Indonesian".equals(animal.getOrigin()))
                .mapToInt(a -> a.getAge())
                .average();
        System.out.println("Средний возраст всех животных из Indonesian = " + average.getAsDouble());
    }

    private static void task12() throws IOException {
        List<Person> people = Util.getPersons();
        System.out.println("Во Французский легион приняты следующие 200 человек: ");
        people.stream()
                .filter(pip -> "Male".equals(pip.getGender()))
                .filter(p -> {
                    int years = Period.between(p.getDateOfBirth(), LocalDate.now()).getYears();
                    return years >= 18 && years <= 27;
                })
                .sorted(Comparator.comparingInt(p -> p.getRecruitmentGroup()))
                .limit(200)
                .forEach(System.out::println);
    }

    private static void task13() throws IOException {
        List<House> houses = Util.getHouses();
        List<Person> listHospital = houses.stream()
                .filter(x -> "Hospital".equals(x.getBuildingType()))
                .flatMap(person -> person.getPersonList().stream())
                .toList();

        List<Person> listYoungOld = houses.stream()
                .filter(x -> !"Hospital".equals(x.getBuildingType()))
                .flatMap(person -> person.getPersonList().stream())
                .filter(p -> {
                    int years = Period.between(p.getDateOfBirth(), LocalDate.now()).getYears();
                    return years <= 18 || years >= 60;
                })
                .toList();

        List<Person> listAll = houses.stream()
                .flatMap(person -> person.getPersonList().stream())
                .collect(Collectors.toList());

        System.out.println("Больные:");
        listHospital.forEach(System.out::println);
        System.out.println("Больные количество =" + listHospital.size());
        System.out.println("Вторая очередь детей и стариков (до 18 и пенсионного возраста):");
        listYoungOld.forEach(System.out::println);
        System.out.println("Вторая очередь количество =" + listYoungOld.size());

        listAll.removeAll(listHospital);
        listAll.removeAll(listYoungOld);
        System.out.println("Остальные:");
        List<Person> listOther = listAll.stream()
                .limit(500 - listHospital.size() - listYoungOld.size())
                .toList();
        listOther.forEach(System.out::println);
        System.out.println("Остальные количество =" + listOther.size());
    }

    private static void task14() throws IOException {
        List<Car> cars = Util.getCars();
       // List<Car> carsTurk = new ArrayList<>();
        List<Car> carsRussia = new ArrayList<>();
        List<Car> carsUzbek = new ArrayList<>();
        List<Car> carsKazax = new ArrayList<>();
        List<Car> carsKarg = new ArrayList<>();
        List<Car> carsMongol = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        List<Car> carsTurk =
                cars.stream()
                        .filter(model -> "Jaguar".equals(model.getCarMake()) || "White".equals(model.getColor()))
                        .toList();
        double sumTurk = carsTurk.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №1 - Туркменистан " + df.format(sumTurk) + "$");
        cars.removeAll(carsTurk);
        carsUzbek =
                cars.stream()
                        .filter(mas -> mas.getMass() < 1500)
                        .filter(model -> "BMW".equals(model.getCarMake())
                                || "Lexus".equals(model.getCarMake())
                                || "Chrysler".equals(model.getCarMake())
                                || "Toyota".equals(model.getCarMake()))
                        .toList();
        double sumUzbek = carsUzbek.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №2 - Узбекистан " + df.format(sumUzbek) + "$");
        cars.removeAll(carsUzbek);
        //нет черных машин
        carsKazax =
                cars.stream()
                        .filter(mas -> mas.getMass() >= 4000)
                        .filter(color -> "Black".equals(color.getColor()))
                        .filter(model -> "GMC".equals(model.getCarMake())
                                || "Dodge".equals(model.getCarMake()))
                        //   .forEach(System.out::println);
                        .toList();
        double sumKazax = carsKazax.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №3 - Казахстан " + df.format(sumKazax) + "$");
        cars.removeAll(carsKazax);
        carsKarg = cars.stream()
                .filter(mas -> mas.getReleaseYear() < 1982)
                .filter(model -> "Civic".equals(model.getCarModel())
                        || "Cherokee".equals(model.getCarModel()))
                .toList();
        double sumKarg = carsKarg.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №4 - Кыргыстан " + df.format(sumKarg) + "$");
        cars.removeAll(carsKarg);
        //И а не ИЛИ?
        carsRussia =
                cars.stream()
                        .filter(priceColor -> priceColor.getPrice() > 40000
                                && !("Yellow".equals(priceColor.getColor())
                                || "Red".equals(priceColor.getColor())
                                || "Green".equals(priceColor.getColor())
                                || "Blue".equals(priceColor.getColor())))
                        .toList();
        double sumRussia = carsRussia.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №5 - Россия " + df.format(sumRussia) + "$");
        cars.removeAll(carsRussia);
        carsMongol =
                cars.stream()
                        .filter(vin -> vin.getVin().contains("59"))
                        .toList();
        double sumMong = carsMongol.stream().mapToInt(Car::getMass).sum() * 7.14 / 1000;
        System.out.println("Транспортные расходы на эшелон №6 - Монголия " + df.format(sumMong) + "$");
        int sumIncome1 = carsTurk.stream().mapToInt(Car::getPrice).sum();
        int sumIncome2 = carsUzbek.stream().mapToInt(Car::getPrice).sum();
        int sumIncome3 = carsKazax.stream().mapToInt(Car::getPrice).sum();
        int sumIncome4 = carsKarg.stream().mapToInt(Car::getPrice).sum();
        int sumIncome5 = carsRussia.stream().mapToInt(Car::getPrice).sum();
        int sumIncome6 = carsMongol.stream().mapToInt(Car::getPrice).sum();
        double v = sumTurk + sumKazax + sumKarg + sumUzbek + sumRussia + sumMong;
        int i = sumIncome1 + sumIncome2 + sumIncome3 + sumIncome4 + sumIncome5 + sumIncome6;
        System.out.println("Общая выручка логистической кампании с учетом расходов = " + (i - (int) v));
    }

    private static void task15() throws IOException {
        List<Flower> flowers = Util.getFlowers();
        System.out.println("Для оранжереи подобраны растения: ");
        Stream<Flower> flowerStream = flowers.stream()
                .sorted(new FlowersComparator().reversed()
                        .thenComparing(Comparator.comparingInt(Flower::getPrice).reversed())
                        .thenComparing(Comparator.comparingDouble(Flower::getWaterConsumptionPerDay).reversed()))
                .filter(f -> f.getCommonName().charAt(0) >= 'C' && f.getCommonName().charAt(0) <= 'S')
                .filter(f -> f.isShadePreferred())
                .filter(flower -> flower.getFlowerVaseMaterial().contains("Aluminum") && flower.getFlowerVaseMaterial().contains("Glass") && flower.getFlowerVaseMaterial().contains("Steel"));
        double sum = flowerStream.mapToDouble(price -> (price.getPrice() + (price.getWaterConsumptionPerDay() * 1.39 * 5 * 365)))
                .sum();
        System.out.println("Стоимость обслуживания на 5 лет выбранных растений составит: " + sum + " $");
    }

    public static List<Car> methodRemove(Stream<Car> stream, List<Car> list) {
        List<Car> oldList = stream.toList();
        for (int i = 0, j = 0; i < oldList.size(); i++) {
            if (oldList.get(i).getId() == list.get(j).getId()) {
                oldList.remove(i);
                j++;
            }
        }

        return oldList;
    }

}

class FlowersComparator implements Comparator<Flower> {

    public int compare(Flower a, Flower b) {

        return a.getOrigin().toUpperCase().compareTo(b.getOrigin().toUpperCase());
    }
}