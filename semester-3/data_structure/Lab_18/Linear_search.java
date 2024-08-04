public class Linear_search{
	public static void main(String[] args) {
		int[] arr ={2,5,6,9,5,3,5};
		int key = 5;
		int i;
			for(i=0; i<arr.length; i++){
				if(arr[i]==key){
				System.out.println(i);
				break;		
			}
		}

	}
} 