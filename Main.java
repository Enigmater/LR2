
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();

        Car car1 = new Car();
        Car car2 = new Car();
        car1.setMileage(20000);
        car2.setMileage(20000);
        car1.comprasionByMilage(car2);
    }

}