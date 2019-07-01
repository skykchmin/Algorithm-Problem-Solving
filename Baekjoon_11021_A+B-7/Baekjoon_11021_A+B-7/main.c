#include <stdio.h>

int main(void) {

	int num = 0;
	int A, B = 0;
	int result[100] = { 0, };
	scanf_s("%d", &num);

	for (int i = 0; i < num; i++) {
		scanf_s("%d %d", &A, &B);
		result[i] = A + B;
	}

	for (int i = 0; i < num; i++) {
		printf("Case #%d: %d\n", i + 1, result[i]);
	}

	system("pause");

	return 0;
}