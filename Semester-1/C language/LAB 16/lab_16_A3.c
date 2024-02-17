#include <stdio.h>

void main() {
  int n, m, i, j;
  // printf("Enter a array size : ");
  // scanf("%d %d", &n, &m);
  int arr[2][20];
  for (i = 0; i < 20; i++) {
    for (j = 0; j < 2; j++) {
      printf("Enter a student %d : ", i);
      scanf("%d", &arr[i][j]);
    }
  }
  for (i = 0; i < 20; i++) {
    for (j = 0; j < 2; j++) {
      printf("%d ", arr[i][j]);
    }
    printf("\n");
  }
}