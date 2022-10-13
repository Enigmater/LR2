import java.util.*;
public class Car {
    private InfoAbout infoAbout;
    private Size size;
    private Parameters param;
    private TypeCar typeCar;

    Car() {
        infoAbout = new InfoAbout();
        size = new Size();
        param = new Parameters();
        typeCar = new TypeCar();
    };
    Car(InfoAbout info) {
        this.infoAbout = new InfoAbout(info.getModel(), info.getColor(), info.getYearRelease());
        size = new Size();
        param = new Parameters();
        typeCar = new TypeCar();
    };
    Car(InfoAbout info, Size size, Parameters param, TypeCar type) {
        this.infoAbout = new InfoAbout(info.getModel(), info.getColor(), info.getYearRelease());
        this.size = new Size(size.getLength(), size.getWidth(), size.getWidth());
        this.param = new Parameters(param.getEnginePower(), param.getTankCapacity(), param.getMaxSpeed(), param.getMileage());
        this.typeCar = new TypeCar(type.getTypeBody(), type.getNumberSeats());
    };
    public void setMileage(float mileage){
        param.setMileage(mileage);
    };
    public void read(){
        Scanner in = new Scanner(System.in);
        infoAbout = infoAbout.readInfo();
        size = size.readSize();
        param = param.readParam();
        typeCar = typeCar.readType();
    };
    public void print(){
        System.out.println("Модель: " + infoAbout.getModel());
        System.out.println("Цвет: " + infoAbout.getColor());
        System.out.println("Дата выпуска: " + infoAbout.getYearRelease());

        System.out.println("Длина: " + size.getLength());
        System.out.println("Ширина: " + size.getWidth());
        System.out.println("Высота: " + size.getHigh());

        System.out.println("Мощность двигателя: " + param.getEnginePower());
        System.out.println("Объем бака: " + param.getTankCapacity());
        System.out.println("Макс.скорость: " + param.getMaxSpeed());
        System.out.println("Пробег: " + param.getMileage());

        System.out.println("Кузов: " + typeCar.getTypeBody());
        System.out.println("Кол-во сидений: " + typeCar.getNumberSeats());
    };
    public int age(){
        final int THIS_YEAR = 2022;
        return (THIS_YEAR - infoAbout.getYearRelease());
    };
    public void comprasionByMilage(Car car){
        System.out.println("\n\tСравнение машин по пробегу");
        float difference = param.getMileage() - car.param.getMileage();
        if (difference < 0) {
            System.out.println("Пробег первого авто < пробег вторго авто");
        }
        else if (difference > 0) {
            System.out.println("Пробег первого авто > пробег вторго авто");
        }
        else {
            System.out.println("Пробег первого авто = пробег вторго автоd");
        }
    };
}
