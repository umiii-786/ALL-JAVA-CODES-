import java.util.Scanner;

public class Motorcycle extends Vehicleinfo{
    private double price;
    private String company;

    public void Company(){
        System.out.println("enter your company name :");
        this.company=sc.nextLine();
        }

    public void getprice(){
        System.out.println("enter the price of motorcycle :");
        this.price=sc.nextDouble();
    }
    public void showinfo(){
        System.out.println("name of company is "+this.company);
        System.out.println("model is "+this.model);
        System.out.println("made in the year "+this.year);
        System.out.println("the price is "+this.price);
        System.out.println("type of fuel it required is "+this.fuelType);
        
    }

   }
