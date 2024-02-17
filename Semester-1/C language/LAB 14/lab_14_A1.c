#include<stdio.h>
void main(){
	int n,i;
	printf("Enter a array a size :");
	scanf("%d", &n);
	int num[n];
	printf("Enter a number :");
	for(i=0; i<n; i++){
		scanf("%d", &num[i]);
	}
	printf("Normal Order :\n");
	for(i=0; i<n; i++){
		printf("%d\n", num[i]);
	}
	printf("Reverse Order :\n");
	for(i=(n-1); i>=0; i--){
		printf("%d\n", num[i]);
	}
}

