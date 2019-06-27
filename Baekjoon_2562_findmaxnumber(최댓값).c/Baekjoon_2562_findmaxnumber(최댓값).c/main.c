#include <stdio.h>
#define MAX 9;

int main(void) {

	int arr[9] = { 0, };
	int max = arr[0];
	int num = 0;
	for (int i = 0; i < 9; i++) {
		scanf("%d", &arr[i]);
	}

	for (int i = 0; i < 9; i++) {

		if (max < arr[i]) {
			max = arr[i];
			num = i+1;
		}
	}

	printf("%d\n", max);
	printf("%d\n", num);

	/*system("pause");*/

	return 0;
}

