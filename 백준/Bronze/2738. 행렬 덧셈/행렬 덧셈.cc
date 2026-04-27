#include <stdio.h>

int main(void)
{
	int a[100][100];
	int b[100][100];
	int n,m;
	scanf("%d %d", &n, &m);
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < m; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	for(int k = 0; k < n; k++)
	{
		for(int l = 0; l < m; l++)
		{
			scanf("%d", &b[k][l]);
		}
	}
	for(int q = 0; q < n; q++)
	{
		for(int w = 0; w < m; w++)
		{
			a[q][w] += b[q][w];
			printf("%d ", a[q][w]);
		}
		printf("\n");
	}
	return 0;
}