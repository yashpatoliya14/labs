#include<stdio.h>
int main(){
	
	int p,c,m,com,eng,par;
	printf("Enter a five sub. marks :");
	scanf("%d", &p);
	scanf("%d", &c);
	scanf("%d", &m);
	scanf("%d", &eng);
	scanf("%d", &com);
	par=((p+c+m+eng+com)*100)/500;
	
	if(par<=35){
		printf("fail");
	}
	else if(35<=par && par<=45){
		printf("pass class");
	}
	else if(45<=par && par<=60){
		printf("second class");
	}
	else if(60<=par && par<=70){
		printf("First class");
	}
	else if(70<par){
		printf("distinction class");
	}else{
		printf("not valid");
	}
		
	return 0;
}

