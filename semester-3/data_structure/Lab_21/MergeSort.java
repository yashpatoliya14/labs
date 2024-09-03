public class MergeSort{
    static void mergeSort(int[] arr,int low,int high){
        if(low < high){
            int mid = (low + high)/2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);

            return;
        }
    }
    static void merge(int arr[],int low,int mid,int high){
        int h,i,j,k;
        h=mid+1;
        i=low;
        j=low;

        int[] temp = new int[high+1];

        while(j<=mid && h<=high){
            if(arr[h]>=arr[j]){   
                temp[i]=arr[j];
                j++;
            }else{
                temp[i]=arr[h];
                h++;
            }   
            i++;
        }
        if(j>mid){
            for (k = h; k <= high; k++) {
                temp[i]=arr[k];
                i++;
            }
        }else{
            for ( k = j; k <= mid; k++) {
                temp[i]=arr[k];
                i++;    
            }
        }

        for (int l = low; l <=high; l++) {
            arr[l]=temp[l];
        }
    }
    public static void main(String[] args) {
        int[] arr={5,6,9,8,4,5,6,2,1,0};
        
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}