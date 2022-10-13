import java.util.Scanner;

public class InfoAbout {
    private String model;
    private String color;
    private int yearRelease;
    InfoAbout() {
        model = "Car model";
        color = "Car color";
        yearRelease = 2022;
    };
    InfoAbout(String model) {
        this.model = model;
        color = "Car color";
        yearRelease = 2022;
    };
    InfoAbout(String model, String color, int yearRelease) {
        this.model = model;
        this.color = color;
        this.yearRelease = yearRelease;
    };

    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return color;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public InfoAbout readInfo(){
        Scanner in = new Scanner(System.in);
        String model, color;
        int yearRelease;
        System.out.print("Модель: ");
        model = in.nextLine();
        System.out.print("Цвет: ");
        color = in.nextLine();
        System.out.print("Дата выпуска: ");
        yearRelease = in.nextInt();
        InfoAbout infoRead = new InfoAbout(model, color, yearRelease);
        return infoRead;
    }
}
