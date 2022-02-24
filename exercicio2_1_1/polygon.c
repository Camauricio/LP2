#include <stdio.h>

typedef struct {
	int x1Points;
	int y1Points;
	int x2Points;
	int y2Points;
	int x3Points;
	int y3Points;
	int nPoints;
	
} Polygon;

void Print(Polygon*pl);

int main() {
	Polygon pl = {60,60,180,60,120,120,3};
	Print(&pl);
}

void Print(Polygon*pl) {
	printf("O Poligono tem os seguintes vertices (%i, %i).\n", pl->x1Points, pl->y1Points);
	printf("(%i, %i).\n", pl->x2Points, pl->y2Points);
	printf("%i, %i).\n", pl->x3Points, pl->y3Points);
	printf("Possui %i lados, logo e um triangulo", pl->nPoints );
	
}
