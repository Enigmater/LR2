import java.util.Scanner;

public class Parameters {
    private float enginePower;
    private float tankCapacity;
    private float maxSpeed;
    private float mileage;
    Parameters() {
        enginePower = 150.0f;
        tankCapacity = 50.0f;
        maxSpeed = 200.0f;
        mileage = 10000.0f;
    };
    Parameters(float enginePower) {
        this.enginePower = enginePower;
        tankCapacity = 50.0f;
        maxSpeed = 200.0f;
        mileage = 10000.0f;
    };
    Parameters(float enginePower, float tankCapacity, float maxSpeed, float mileage){
        this.enginePower = enginePower;
        this.tankCapacity = tankCapacity;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    };

    public float getEnginePower(){
        return enginePower;
    }
    public float getTankCapacity(){
        return tankCapacity;
    }
    public float getMaxSpeed(){
        return maxSpeed;
    }
    public float getMileage(){
        return mileage;
    }
    public void setEnginePower(float enginePower){
        this.enginePower = enginePower;
    }
    public void setTankCapacity(float tankCapacity){
        this.tankCapacity = tankCapacity;
    }
    public void setMaxSpeed (float maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setMileage(float mileage){
        this.mileage = mileage;
    }
    public Parameters readParam(){
        Scanner in = new Scanner(System.in);
        float enginePower, tankCapacity, maxSpeed, mileage;
        System.out.print("Мощность двигателя: ");
        enginePower = in.nextFloat();
        System.out.print("Объем бака: ");
        tankCapacity = in.nextFloat();
        System.out.print("Макс.скорость: ");
        maxSpeed = in.nextFloat();
        System.out.print("Пробег: ");
        mileage = in.nextFloat();
        Parameters parameters = new Parameters(enginePower, tankCapacity, maxSpeed, mileage);
        return parameters;
    }
}
