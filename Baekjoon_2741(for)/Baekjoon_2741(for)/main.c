#include <stdio.h>

int main(void) {

	int num;

	scanf_s("%d", &num);
	for (int i = num; i <= 1; i) {
		printf("%d\n", i);
	}

	system("pause");

	return 0;
}