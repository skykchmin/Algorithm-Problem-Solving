#include <stdio.h>

int main(void) {

	int num;
	scanf("%d", &num);

	for (int i = 1; i <= num; i++) {
		for (int j = 0; j < num; j++) {
			if (j < num - i)
				printf(" ");
			else
				printf("*");
		}
		printf("\n");
	}


	

	//system("pause");

	return 0;
}