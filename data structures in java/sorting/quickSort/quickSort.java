public class quickSort {
  

    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void qSort(int arr[],int si,int ei){

        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        qSort(arr, si, pIdx -1);
        qSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[],int si , int ei){

        int pivot = arr[ei];
        int i = si -1;
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]= temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = {2,1,3,5,-1,4,6,8,7,10,9};
        qSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}


