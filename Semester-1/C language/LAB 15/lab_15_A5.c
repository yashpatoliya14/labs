#include<stdio.h>

void main(){
    int n,i,count=0;
    printf("Enter a size : ");
    scanf("%d", &n);
    char ch[n+1]; 
    for(i=0; i<n; i++){
        printf("Enter %d character : ", i);
        scanf(" %c", &ch[i]); 
        count++;  
    }
    ch[n]='\0'; 
    for(i=0; i<n; i++){
        printf("%c", ch[i]);
    }
    printf("\nLength of string: %d", count);
}
