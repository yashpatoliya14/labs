#include<stdio.h>
int main(){

	char ch;
	scanf("%c", &ch);
	
	if(ch>='a' && ch<='z'){
	
	printf("charcter is  lowercase");
	
	}
	else if(ch>='A' && ch<='Z' ){
	
	printf("charcter is  Uppercase");
	
	}
	
	else if(ch>='0' || ch<='9'){
	printf("charcter is digit");
	
	}else{
	printf("charcter is special charcter");		
	}
	
	
	
	
	

return 0;
}

