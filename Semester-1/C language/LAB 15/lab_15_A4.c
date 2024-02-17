#include<stdio.h>

void main(){
    int n,i,search,count;
    printf("Enter a size : ");
    scanf("%d", &n);
    int num[n];
    for(i=0; i<n; i++){
        scanf("%d", &num[i]);  
    }
    printf("search :");
    scanf("%d", &search);
   for(i=0; i<n; i++){
        if (num[i]==search)
        {
            count=1;
        }
        
   } 
   if(count==1){
    printf("Number is Exist");

   }else{
    printf("Number isnot Exist");
   }
}