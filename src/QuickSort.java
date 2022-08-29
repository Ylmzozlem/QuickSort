import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("How many data you will add: ");
        int d=scn.nextInt();

        int[]  list = new int[d];

        for(int i=0; i<d; i++){
            System.out.println("Enter your "+(i+1) +". data: ");
            int value=scn.nextInt();
            list[i]=value;
        }
        System.out.println(Arrays.toString(list));


        System.out.println(Arrays.toString(quicksort(list, 0, list.length - 1)));
    }

    static void swap(int[] list, int low, int pivot){
        int tmp = list[low];
        list[low] = list[pivot];
        list[pivot] = tmp;
    }

    static int partition(int[] list, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(list[j] < list[low])
                swap(list, ++p, j);

        swap(list, low, p);
        return p;
    }

    static int[] quicksort(int[] list, int low, int high){
        if(low < high){
            int p = partition(list, low, high);
            quicksort(list, low, p-1);
            quicksort(list, p+1, high);
        }
        return list;
    }


}

