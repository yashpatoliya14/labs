public class ShellSort{ 
	static void shellSort(int[] arr){
		for(int i=(arr.length/2)-1; i>=1; i=i/2){
			for (int j=i;j<arr.length;j++ ) {
				for (int k=j-i;k>=0 ;k=k-i ) {
					if(arr[i+k]>arr[k]){
						break;
					}else{
						int temp = arr[i+k];
						arr[i+k] = arr[k];
						arr[k] = temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,4,6,7,8,9,1,2,3,4,5,2};
		shellSort(arr);
	}
}