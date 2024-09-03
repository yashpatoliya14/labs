public class InsertionSort{
	public static void main(String[] args) {
		int arr[] = {5,9,8,4,2,1,2,0};
		
		for (int i=1; i<arr.length ; i++ ) {
			int min = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>min){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=min;
x
		}

		for (int i=0; i<arr.length ; i++ ) {
			System.out.println(arr[i] + " ");
		}
	}
}