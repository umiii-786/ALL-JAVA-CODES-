public class Vehicleinfo extends Vehicles_template{
    public String model;
    public String year;
    public String fuelType; 

  
      public void model(){
      System.out.println("enter model name :");
      this.model=sc.nextLine();

    }
      public void year(){
      System.out.println("enter  year of formation of vehicle ?");
      this.year=sc.nextLine();

    }

      public void fuelType(){
      System.out.println("enter in which type of fuel your vehicle requuired name :");
      this.fuelType=sc.nextLine();

    }

}