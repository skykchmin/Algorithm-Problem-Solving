#include <stdio.h>

int main(void) {

	int num;
	int sum = 0;
	scanf("%d", &num);

	for (int i = 1; i <= num; i++) {
		sum += i;
	}
	
	printf("%d\n", sum);

	//system("pause");

	return 0;
}