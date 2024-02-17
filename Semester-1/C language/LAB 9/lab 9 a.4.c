#include<stdio.h>
int main(){

int n,i=1,mul;
scanf("%d", &n);

while(i<=n){
	mul*=i;
	i++;
}
printf("%d", mul);
return 0;
}

