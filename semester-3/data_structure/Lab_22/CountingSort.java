public class CountingSort{ 
	static void countingSort(int[] arr){
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length ;i++ ) {
			max = Math.max(max,arr[i]);
		}
		int[] b = new int[max+1];
		for (int i=0;i<b.length ;i++ ) {
			b[i]=0;
		}
		for(int i=0;i<arr.length; i++){
			b[arr[i]]++;
		}
		for(int i=1;i<b.length; i++){
			b[i] = b[i]+b[i-1];
		}
		int temp[] = new int[arr.length];
		for(int i=arr.length-1;i>=0; i--){
			temp[b[arr[i]]-1] = arr[i];
			b[arr[i]]--;
		}
		for(int i=0;i<temp.length; i++){
			System.out.println(temp[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,4,6,7,8,9,1,2,3,4,5,2};
		countingSort(arr);
	}
}