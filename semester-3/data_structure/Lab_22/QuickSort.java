public class QuickSort{ 
	static void quickSort(int[] arr,int lb, int ub){
		if(lb<ub){
			int i=lb;
			int j=ub+1;
			int key = lb;
			boolean flag=true;
			while(flag){	
				i=i+1;
				while(arr[i]<key){
					i=i+1;
				}
				j=j-1;
				while(arr[i]>key){
					j=j-1;
				}
				if(i<j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else{
					flag=false;
				}
			}
			int temp = arr[lb];
			arr[lb] = arr[j];
			arr[j] = temp;

	quickSort(arr,lb,j-1);
	quickSort(arr,j+1,ub);
		}


	}

	public static void main(String[] args) {
		int arr[] = {576,700,58,90,100,222,345,245};
		quickSort(arr,0,arr.length-1);
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
	}
}