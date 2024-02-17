#include<stdio.h>
 
void main(){
    int n,m,i,j;
    printf("Enter a array size : ");
    scanf("%d %d", &n ,&m);
    int arr[n][m];
    for(i=0; i<n; i++){
        for(j=0; j<m; j++){
            scanf("%d", &arr[i][j] );
        }
    }

    for(i=0; i<n; i++){
        for(j=0; j<m; j++){
        printf("%d", arr[i][j] );
        }
        printf("\n");
    }
}