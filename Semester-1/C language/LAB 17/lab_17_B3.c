#include<stdio.h>

void main(){
    int i,j,n,m;
  printf("Enter a size :");
  scanf("%d %d", &n,&m);
    int arr1[n][m],arr2[n][m];
    int *ptr1[n][m];
    int *ptr2[n][m];
    int ptr3[n][m];


    printf("Enter a array 1 : ");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            printf("Enter a [%d][%d] number : ", i,j);
            scanf("%d", &arr1[i][j]);
            ptr1[i][j]=&arr1[i][j];
        }
    }
    printf("Enter a array 2 : ");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            printf("Enter a [%d][%d] number : ", i,j);
            scanf("%d", &arr2[i][j]);
            ptr2[i][j]=&arr2[i][j];
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){   
            ptr3[i][j]=*ptr1[i][j]+*ptr2[i][j];        
        }
    }
    
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            printf("%d ", ptr3[i][j]);
        }
        printf("\n");
    }
}