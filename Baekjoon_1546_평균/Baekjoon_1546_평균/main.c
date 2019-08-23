#include <stdio.h>
int main(void) {
	int num, i;
	double arr[1000];
	double max = 0, avg = 0;
	scanf_s("%d", &num);
	for (i = 0; i < num; i++) {
		scanf_s("%lf", &arr[i]);

		if (max < arr[i])
			max = arr[i];
	}

	for (i = 0; i < num; i++) {
		arr[i] = arr[i] / max * 100.0;
		avg += arr[i];
	}

	printf("%.2lf", (avg / (double)num));

	system("pause");
		return 0;
}