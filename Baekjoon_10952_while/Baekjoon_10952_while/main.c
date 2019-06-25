#include <stdio.h>

int main() {

	int a, b;

	for (;;) {

		scanf_s("%d %d", &a, &b);

		if ('\n') {

			break;
		}
		else {

			printf("%d\n", a + b);
		}

	}
	system("pause");

	return 0;
}