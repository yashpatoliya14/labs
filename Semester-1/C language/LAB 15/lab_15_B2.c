#include <stdio.h>
void main()
{
    int n, i, j, del;
    printf("Enter the array size: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for(i = n-1; i >= 0; i--){
        printf("%d", arr[i]);
    }
}