#include<stdio.h>
int main(){
	int n;
	//b=1;
	
	scanf("%d", &n);
	if((n|1)==n){
		printf(" odd number %d", n );
	}else{
		printf(" even number %d", n );
	}
return 0;
}

