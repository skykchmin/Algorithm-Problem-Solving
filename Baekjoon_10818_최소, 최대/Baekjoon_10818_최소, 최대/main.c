#include <stdio.h>

int main(void) {

	int num = 0;
	int arr[100] = { 0, };
	
	scanf_s("%d", &num);
	
	for (int i = 0; i < num; i++) {

		scanf_s("%d", &arr[i]);

	}

	int max = arr[0];

	for (int i = 0; i < num; i++) {
		if (max < arr[i])
			max = arr[i];
	}

	int min = arr[0];

	for (int i = 0; i < num; i++) {
		if (min > arr[i])
			min = arr[i];
	}
	
	printf("%d %d\n", min, max);

	system("pause");

	return 0;
}