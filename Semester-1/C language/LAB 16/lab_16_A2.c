#include <stdio.h>

void main() {
  int n, m, i, j, neg = 0, pos = 0, zero = 0;
  printf("Enter a array size : ");
  scanf("%d %d", &n, &m);
  int arr[n][m];
  for (i = 0; i < n; i++) {
    for (j = 0; j < m; j++) {
      scanf("%d", &arr[i][j]);
    }
  }

  for (i = 0; i < n; i++) {
    for (j = 0; j < m; j++) {
      // printf("%d  ", arr[i][j] );
      if (arr[i][j] < 0) {
        neg++;
      } else if (arr[i][j] > 0) {
        pos++;
      } else {
        zero++;
      }
    }
  }
  printf("pos : %d neg:  %d zero : %d", neg, pos, zero);
}