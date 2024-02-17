#include<stdio.h>
#include<math.h>
int main(){
	float i=0;
	
	while(i<=9){
		printf("%.0f", i);
		printf("  =");
		printf(" %f\n", sqrt(i));
		i++;
	}
return 0;
}

