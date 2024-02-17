#include<stdio.h>

void main(){

float sal;
float gros;

printf("Enter a salary :");
scanf("%f", &sal);

if(sal>=10000 && sal<20000){
	
	 gros=(sal + (sal*0.2) + (sal*0.8));
}
if(sal>=20000 && sal<30000){

	gros=(sal + (sal*0.2) + (sal*0.8));

}
 if(sal>=30000){
	gros=(sal + (sal*0.2) + (sal*0.8));
	
}

//printf("%f", hra);
//printf("%f", da);
printf("%f", gros);

}
