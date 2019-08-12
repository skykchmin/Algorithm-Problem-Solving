#include <stdio.h>


int main(void) {
	int n, i;
	int result = 1;
	scanf_s("%d", &n);
	if (n == 1) {
		printf("1");
	}
	else {
		for (i = 1; i <= n; i++) {
			result = result * i;
		}
		printf("%d", result);
	}

	system("pause");
	return 0;
}