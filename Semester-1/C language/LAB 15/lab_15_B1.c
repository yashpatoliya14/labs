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
    printf("Enter a delete Element : ");
    scanf("%d", &del);

    if (del < n)
    {

        for (i = del; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
    }

    for (i = 0; i < n - 1; i++)
    {
        printf("%d", arr[i]);
    }
}