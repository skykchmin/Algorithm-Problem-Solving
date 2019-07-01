#include <stdio.h>

int main(void) {

	int num = 0;

	int A[100] = { 0, };
	int B[100] = { 0, };
	int result[100] = { 0, };
	scanf_s("%d", &num);

	for (int i = 0; i < num; i++) {
		scanf_s("%d %d", &A[i], &B[i]);
		result[i] = A[i] + B[i];
	}

	for (int i = 0; i < num; i++) {
		printf("Case #%d: %d + %d = %d\n", i + 1, A[i], B[i], result[i]);
	}

	system("pause");

	return 0;
}