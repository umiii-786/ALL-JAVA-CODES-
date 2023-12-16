import java.util.Scanner;

class generate_report {
    static double average = 70000.0;
    private int index = -1;
    static int count_sales = 0;
    static String[] name = new String[10];
    static double[] sales = new double[10];
    Scanner sc = new Scanner(System.in);

    generate_report() {
        name[count_sales] = "hfg";
        sales[count_sales] = 28.34;
        this.index = count_sales;
        count_sales += 1;
    }

    public void setname() {
        System.out.println("enter associate  "+ (this.index+1) +" name ");
        name[index] = sc.nextLine();
    }

    public String getname() {
        return name[index];
    }

    public void setsale() {
        System.out.println("enter associate "+(this.index+1) +" sale ");
        sales[this.index] = sc.nextDouble();
    }

    public double getsales() {
        return sales[this.index];
    }

    public void checkaverage() {
        if (sales[this.index] == generate_report.average) {
            System.out.println(
                    name[index] + " sales is equal to the average sale because its sale is " + sales[this.index]
                            + " and average sale is " + generate_report.average);
        } else if (sales[this.index] > generate_report.average) {
            System.out.println(
                    name[index] + " sales is greater than average sale because its sale is " + sales[this.index]
                            + " and average sale is " + generate_report.average);
        }
        else {
            System.out
                    .println(name[index] + " sales is less than average sale because its sale is " + sales[this.index]
                            + " and average sale is " + generate_report.average);
        }

    }

    public static void checkHighest() {
        double highest =sales[0];
        for (int i = 1; i < count_sales; i++) {
            if(highest<sales[i]){
                    highest=generate_report.sales[i];
            }
        }
        
        for (int i = 0; i < count_sales; i++) {
            if (highest==sales[i]) {
                System.out.println("highest sales associate is " + name[i] + " and their sale is " + highest );
             }
         }

      }

  }

public class associate {

    public static void main(String[] args) {
        generate_report r1 = new generate_report();
        generate_report r2 = new generate_report();
        r1.setname();
        r1.setsale();

        r2.setname();
        r2.setsale();

        r1.checkaverage();
        r2.checkaverage();
        generate_report.checkHighest();
    }
}
