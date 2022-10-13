import java.util.Scanner;

public class TypeCar {
    private String typeBody;
    private int numberSeats;
    TypeCar() {
        typeBody = "Sedan";
        numberSeats = 5;
    };
    TypeCar(String typeBody) {
        this.typeBody = typeBody;
        numberSeats = 5;
    };
    TypeCar(String typeBody, int numberSeats) {
        this.typeBody = typeBody;
        this.numberSeats = numberSeats;
    };
    public String getTypeBody(){
        return typeBody;
    }
    public int getNumberSeats(){
        return numberSeats;
    }
    public void setTypeBody(String typeBody){
        this.typeBody = typeBody;
    }
    public void setNumberSeats(int numberSeats){
        this.numberSeats = numberSeats;
    }
    public TypeCar readType(){
        Scanner in = new Scanner(System.in);
        String typeBody;
        int numberSeats;
        System.out.print("Кузов: ");
        typeBody = in.nextLine();
        System.out.print("Кол-во сидений: ");
        numberSeats = in.nextInt();
        TypeCar typeCar = new TypeCar(typeBody, numberSeats);
        return typeCar;
    }
}

