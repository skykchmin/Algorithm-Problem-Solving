#include <stdio.h>

int main(void) {

	int num; 
	scanf("%d", &num);

	for (int i = 1; i <= 9; i++) {
		
		int result = 0;
		result = num * i;
			printf("%d * %d = %d\n", num, i, result);
	}

	//system("pause");
	return 0;
}