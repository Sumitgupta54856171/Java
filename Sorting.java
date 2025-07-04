
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Sorting {

public void bubble_sort(int[] arr){
    int n = arr.length;
    boolean swapped;
    for(int i=0;i<n-1;i++){
        swapped = false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                swapped = true;
            }
        }
        if(!swapped) break;
    }
    for (int i =0 ; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Minimum element ka index find karo
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Minimum element ko current position pe swap karo
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

public void insert(int[] arr){
    int n = arr.length;
    for(int i = 1; i <n ; i++){
       int key = arr[i];
       int j = i - 1;
       while(j>=0&& arr[j]>key){
           arr[j+1] = arr[j];
           j--;
       }
       arr[j+1] = key;
    }
}
    public static void binaryInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int left = 0, right = i;

            // Binary search se insertion point find karo
            while (left < right) {
                int mid = (left + right) / 2;
                if (arr[mid] > key) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            // Elements ko shift karo
            for (int j = i; j > left; j--) {
                arr[j] = arr[j - 1];
            }
            arr[left] = key;
        }
    }
    public void merge_sort(int[] arry,int left ,int right){
     if(left < right){
         int mid = left + (right - left)/2;
         merge_sort(arry,left,mid);
         merge_sort(arry,mid+1,right);
         merge(arry,left,right,mid);
     }
    }
    public void merge(int[] arry ,int left,int  right,int mid){
    int[] leftarry = new int[mid-left+1];
    int[] rightarry = new int[right - mid];
    System.arraycopy(arry,left,leftarry,0,leftarry.length);
    System.arraycopy(arry,mid+ 1 ,rightarry,0,rightarry.length);
    int i = 0,j= 0,k= left;
            while(i<leftarry.length && j< rightarry.length) {
                if (leftarry[i] <= rightarry[j]) {
                    arry[k++] = leftarry[i++];
                }else{
                    arry[k++] = rightarry[j++];
                }
            }
        while (i < leftarry.length) {
            arry[k++] = leftarry[i++];
        }
        while (j < rightarry.length) {
            arry[k++] = rightarry[j++];
        }

    }
    public void quick_sort(int[] arry,int left,int right){
    if(left < right){
       int pi = Sorting.partition(arry,left,right);
       quick_sort(arry,left,pi -1);
       quick_sort(arry,pi+1,right);
    }
    }
    public static void randomizedQuickSort(int[] arry, int left , int right) {
        if (left < right) {
            // Random pivot choose karo
            int randomIndex = ThreadLocalRandom.current().nextInt(left, right + 1);
            int temp = arry[randomIndex];
            arry[randomIndex] = arry[right];
            arry[right] = temp;

            int pi = partition(arry, left, right);
            randomizedQuickSort(arry, left, pi - 1);
            randomizedQuickSort(arry, pi + 1, right);
        }
    }
    public static int partition(int[] arry,int left,int right){
    int pivot = arry[right];
    int i = left - 1;
    for(int j = left;j<right;j++){
        if(arry[j] <= pivot){
            i++;
            int temp = arry[i];
            arry[i] = arry[j];
            arry[j] = temp;
        }
    }
    int temp = arry[i+1];
    arry[i+1] = arry[right];
    arry[right] = temp;
    return i+1;
    }

public static void main (String [] args){
    int[] arry = {7,9,0,2,3,5,6,1};
    Sorting b = new Sorting();
    b.bubble_sort(arry);
    int[] sort = {8,6,9,3,2,1,3,5};
    b.insert(sort);
    for(int i= 0;i<sort.length;i++){
        System.out.print(sort[i]);
    }
    System.out.println();
    int[] sort1 = {8,6,9,3,2,1,3,5};
    b.merge_sort(sort1,0,sort1.length-1);
    for(int i= 0;i<sort1.length;i++){
        System.out.print(sort1[i]);
    }
    System.out.println();

    int[] sort2 = {8,6,9,3,2,1,3,5};
    b.quick_sort(sort2,0,sort2.length-1);
    System.out.println("Quick Sort Result:");
    for(int num : sort2){
        System.out.print(num + " ");
    }
    System.out.println();

    int[] sort3 = {8,6,9,3,2,1,3,5};
    randomizedQuickSort(sort3,0,sort3.length-1);
    System.out.println("Randomized Quick Sort Result:");
    for(int num : sort3){
        System.out.print(num + " ");
    }
    System.out.println();
}
}
