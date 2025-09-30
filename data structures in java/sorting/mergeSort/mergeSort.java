package mergeSort;
public class mergeSort {
    

    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void mSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        mSort(arr, si, mid);
        mSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
            
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
            
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
            
        }


        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,3,5,4,6,8,7,10,9};
        mSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
