#include<stdio.h>
void main(){
	int n,i,pos=0,neg=0,zero=0;
	printf("Enter a array a size :");
	scanf("%d", &n);
	int num[n];
	printf("Enter a number :");
	for(i=0; i<n; i++){
		scanf("%d", &num[i]);
	}
	for(i=0; i<n; i++){
		if(num[i] < 0){
			neg++;
		}else if(num[i] > 0){
			pos++;
		}else{
			zero++;
		}
	}
	printf("Positive : %d\n", pos);
	printf("Negative : %d\n", neg);
	printf("Positive : %d\n", zero);
}

