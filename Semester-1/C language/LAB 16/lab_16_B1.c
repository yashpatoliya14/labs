#include<stdio.h>

void main(){
    int n,m,i,j;
    printf("Enter a array size : ");
    scanf("%d %d", &n ,&m);
    int arr[n][m];
    for(i=0; i<n; i++){
        for(j=0; j<m; j++){
            printf("Enter a [%d] [%d]", i,j);
            scanf("%d", &arr[i][j] );
        }
    }
    for(j=0; j<m; j++){
        for(i=0; i<m; i++){
            printf("%d ", arr[i][j]);
    }
    printf("\n");
}
}