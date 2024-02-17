#include<stdio.h>

void main(){
    int n,m,i,j;
    printf("Enter a array size : ");
    scanf("%d %d", &n ,&m);
    int arr1[n][m];
    int arr2[n][m];
    printf("Enter a matrix 1 : ");
    for(i=1; i<=n; i++){
        for(j=1; j<=m; j++){
            printf("Enter a [%d][%d]", i,j);
            scanf("%d", &arr1[i][j] );
        }
    }
    printf("Enter a matrix 2 : ");
    for(i=1; i<=n; i++){
        for(j=1; j<=m; j++){
            printf("Enter a [%d][%d]", i,j);
            scanf("%d", &arr2[i][j] );
        }
    }
    for(i=1; i<=n; i++){
        for(j=1; j<=m; j++){
        printf("%d ", (arr1[i][j] + arr2[i][j]));
        }
        printf("\n");
    }
}