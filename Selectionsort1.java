
public class Selectionsort1 {
    public static void main(String[] args) {
       int []arr={38,12,65,78,68,342,1,54,778};
       for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int sort_array_last_index=i-1;
        while(sort_array_last_index>=0 &&  current < arr[sort_array_last_index]){
                 arr[sort_array_last_index+1]=arr[sort_array_last_index];
                 sort_array_last_index--;
        }
        arr[sort_array_last_index+1]=current;
       }


       for (int i : arr) {
        System.out.println(i);
       }
    }

}
