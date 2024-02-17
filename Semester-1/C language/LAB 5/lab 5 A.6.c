#include<stdio.h>
int main(){

	char ch;
	printf("Enter a charcter :");
	scanf("%c", &ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		
		printf("this charcter is vowel");
		
	}else{
		printf("this charcter isn't vowel");
	}
	

return 0;
}

