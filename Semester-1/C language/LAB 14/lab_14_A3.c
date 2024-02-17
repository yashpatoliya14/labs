#include<stdio.h>
void main(){
	int n,i,odd=0,even=0;
	printf("Enter a array a size :");
	scanf("%d", &n);
	int num[n];
	printf("Enter a number :");
	for(i=0; i<n; i++){
		scanf("%d", &num[i]);
	}
	for(i=0; i<n; i++){
		if(num[i]%2==0){
			even++;
		}else{
			odd++;
		}
	}
	printf("even = %d\n", even);
	printf("odd = %d\n", odd);
}

