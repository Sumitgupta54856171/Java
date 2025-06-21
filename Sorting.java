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
       int j = i-1;
       while(j>=0&& arr[j]>key){
           arr[j+1] = arr[j];
           j--;
       }
       arr[j+1] = key;
    }
}
public static void main (String [] args){
    int[] arry = {7,9,0,2,3,5,6,1};
    Sorting b = new Sorting();
    b.bubble_sort(arry);

}
}
