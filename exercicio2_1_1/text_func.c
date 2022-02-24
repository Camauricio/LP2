#include <stdio.h>

typedef struct {
    char colorFont[];
	char fontType[];
	char fontStyle[];
	int x,y;
} Text;

void Print(Text* tx);


int main() {
    Text tx = {"azul" , " Times New Roman " , " Bold ", 60, 250};
    Print(&tx);
}


void Print(Text* tx) {
    printf("Texto escrito na cor %s na fonte %s com estilo %s.\n" , sp->colorFont ,sp->.fontType ,sp->fontStyle );
	printf("A partir da coordenada (%d, %d )." , sp->x , sp->y);
	}
}
