package director;

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);    // 객체 생성은 디렉터가 추진
        Car car = carBuilder.getResult();      // 결과물은 builder에서 도출한다.
        System.out.println("Car built :\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built :\n"+carManual.print());
    }
}