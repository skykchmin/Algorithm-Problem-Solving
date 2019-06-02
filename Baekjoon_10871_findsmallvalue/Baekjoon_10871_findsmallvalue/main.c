#include <stdio.h>

int main(void) {

	int n = 0;
	int x = 0;
	int a[10000] = { 0, };

	scanf_s("%d %d", &n, &x);

	for (int i = 0; i < n; i++) {
		scanf_s("%d", &a[i]);
	}
	
	for (int i = 0; i < n; i++) {
		if (a[i] < x) {
			printf("%d ", a[i]);
		}
	}
	system("pause");
	return 0;
}