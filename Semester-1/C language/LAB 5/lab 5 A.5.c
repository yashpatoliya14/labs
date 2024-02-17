#include<stdio.h>
void main(){


	int a,b,c;
	printf("Enter a three number :");
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);	
	
	if(a>b){
		if(a>c){
			printf("largest %d", a );
			
		}else{
			printf("largest %d", c );			
		}
	}else{
		if(b>c){
			printf("largest %d", b );
		}else{
			printf("largest %d", c );
		}
	}

}

