
public class recursion {
    public static boolean check(int number[], int indx) {
        if (indx == number.length - 1) {
             return true;
        }
        if (number[indx] < number[indx + 1]) {
            return check(number, indx + 1);
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        int[] number = {1,2,3,4,5};
        boolean dec=check(number, 0);
        if (dec==true) {
            System.out.println("array is sorted ");
        } else {
            System.out.println("array is not sorted ");
        }

    }
}
