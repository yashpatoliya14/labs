public class BubbleShort{
	public static void main(String[] args) {
		int arr[] = {5,9,8,4,2,1,2,0};
		boolean flag=true;
		for (int i=0;i<arr.length-1;i++.) {
			for (int j=0;j<arr.length-i;j++ ) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}

		for (int i=0; i<arr.length ; i++ ) {
			System.out.println(arr[i] + " ");
		}
	}
}