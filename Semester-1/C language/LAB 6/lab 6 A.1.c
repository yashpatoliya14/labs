#include<stdio.h>

void main(){

int a,b;
char m;
printf("Enter a two number :");
	scanf("%d", &a);
	scanf("%d", &b);

printf("Enter a +,-,*,/  :");

scanf(" %c", &m);

if(m=='+'){
	printf("ans :%d", a+b);
}else if(m=='-'){
	printf("ans :%d", a-b);
}else if(m=='*'){
	printf("ans :%d", a*b);
}else if(m=='/'){
	printf("ans :%d", a/b);
}else{
	printf("Enter A Valid Char");
}

}
