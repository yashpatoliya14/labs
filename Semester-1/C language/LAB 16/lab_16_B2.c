#include<stdio.h>

void main(){
    int n,m,o,p,q,i,j,sum=0;
    printf("Enter a array 2 size : ");
    scanf("%d %d", &n ,&m);
    printf("Enter a array 1 size : ");
    scanf("%d %d", &o, &p);
    int arr1[n][m];
    int arr2[o][p];
    int arr3[n][p];

    if(o==m){ 
    printf("Enter a matrix 1 : ");
    for(i=0; i<n; i++){
        for(j=0; j<m; j++){
            printf("Enter a [%d][%d]", i,j);
            scanf("%d", &arr1[i][j] );
        }
    }
    printf("Enter a matrix 2 : ");
    for(i=0; i<o; i++){
        for(j=0; j<p; j++){
            printf("Enter a [%d][%d]", i,j);
            scanf("%d", &arr2[i][j] );
        }
    }
    for(i=0; i<n; i++){
        for(j=0; j<p; j++){
            arr3[i][j]=0;
            for(int k=0; k<m; k++){
                arr3[i][j]+=(arr1[i][k]*arr2[k][j]);
            }
        }
    }
    for(i=0; i<n; i++){
        for(j=0; j<p; j++){
            printf("%d\t", arr3[i][j]);
        }
        printf("\n");
    }
    }else{
        printf("matrix is not posible this size");
    }
}