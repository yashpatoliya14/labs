public class BinarySearch{
	static int search(int[] arr,int left,int right,int key){
		if(left<=right){
			int mid = (left+right)/2;
			if(arr[mid]==key){
				return mid;
			}else if(arr[mid]>key){
				return search(arr,left,mid-1,key);
			}else{
				return search(arr,mid+1,right,key);
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int[] arr ={2,5,6,9,10,11,15};
		int key = 5;
		//recursive approach
		int left=0;
		int right=arr.length-1;

		while(left<=right){
			int mid = (left+right)/2;
			if(arr[mid]==key){
				System.out.println(mid);
				break;
			}else if(arr[mid]>key){
				right = mid-1; 
			}else{
				left = mid+1;
			}

		}

	}
} 