#include<stdio.h>
int main(){

int a,num;
scanf("%d", &num);

a=num%10;
if(a%2==0){
	printf("The last number is %d even", a);
}else{
	printf("The last number is %d odd", a);
}
return 0;
}
