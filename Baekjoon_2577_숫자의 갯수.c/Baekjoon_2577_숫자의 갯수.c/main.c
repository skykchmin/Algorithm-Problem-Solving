#include <stdio.h>

int main(void) {

	int A, B, C = 0;
	int result = 0;
	int arr[10] = { 0, };

	scanf_s("%d", &A);
	scanf_s("%d", &B);
	scanf_s("%d", &C);

	result = A * B * C;

	while (result > 0) {
		switch (result % 10) {

		case 0:
			arr[0]++;
			break;

		case 1:
			arr[1]++;
			break;

		case 2:
			arr[2]++;
			break;

		case 3:
			arr[3]++;
			break;

		case 4:
			arr[4]++;
			break;

		case 5:
			arr[5]++;
			break;

		case 6:
			arr[6]++;
			break;

		case 7:
			arr[7]++;
			break;

		case 8:
			arr[8]++;
			break;

		case 9:
			arr[9]++;
			break;
		}
		result /= 10;
	}
	int i = 0;
	while (i < 10) {
		printf("%d\n", arr[i]);
		i++;
	}

	system("pause");
	return 0;

}

