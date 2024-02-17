#include<stdio.h>
int main(){

int x,y,i=1,p=1;
scanf("%d", &x);
scanf("%d", &y);
while(i<=y){
	p=p*x;
	i++;
}
printf("%d", p);
return 0;
}

