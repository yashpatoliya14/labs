#include<stdio.h>
int main(){
	
	int a,b,c,max;
	printf("Enter a three number :");
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);	
	
	max= a>b ? a:b;
	max=c>max?c:max;
	
	

return 0;
}

