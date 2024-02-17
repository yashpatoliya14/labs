#include<stdio.h>

void main(){
 int i,j,n,m,sum1=0,sum2=0;

 printf("Enter a array size :");
 scanf("%d %d", &n,&m);
 int arr[n][m]; 
 for(i=0; i<n; i++){
        for(j=0; j<m; j++){
            printf("Enter a [%d] [%d]", i,j);
            scanf("%d", &arr[i][j] );
        }
    }
 for(i=0;i<n;i++){
    for(j=0;j<m;j++){
            if(i==j){
                printf("%d\t", arr[i][j]);    
                sum1+=arr[i][j];
            }
            else if(i+j==n-1){
                printf("%d\t", arr[i][j]);
                sum2+=arr[i][j];
            }else{
                printf(" \t");
            }
            
    }
    printf("\n");
 }
 printf("\n Sum1= %d",sum1);
 printf("\n Sum2= %d",sum2);
}