public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++1)  {
            if(arr[j] < pivot)  {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;
        return i; //pivot index




    }


    public static void quickSort(int arr [], int low, int high) {
        if(low < high) {
            int pindx= partition(arr, low, high);

            quickSort(arr, low,pidx-1);
            quickSort(arr, pdx+1, high);
            );
        }

    }
    public static void main (String args[]){
       int[] arr = {60,30,90,50,20,80};
       int n = arr.length;


       quickSort(arr,0, n-1);

        //print
        for(int i=0; i<n, i++) {
            System.out.prinnt(arr[i]+" ");
        }


        }
}
