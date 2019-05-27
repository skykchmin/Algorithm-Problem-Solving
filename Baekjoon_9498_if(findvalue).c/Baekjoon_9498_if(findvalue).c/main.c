#include <stdio.h>

int main(void) {

	int score = 0; 
	scanf_s("%d", &score);
	do {
		if (score >= 90 && score <= 100) {
			printf("A");
			break;
		}
		else if (score >= 80 && score <= 89) {
			printf("B");
			break;
		}
			
		else if (score >= 70 && score <= 79) {
			printf("C");
			break;
		}
		
		else if (score >= 60 && score <= 69) {
			printf("D");
			break;
		}
			
		else {
			printf("F");
			break;
		}
			
	} while (score >= 0 && score <= 100);


	

	system("pause");
	return 0;
}