#include <stdio.h>

float fatorial (int n)
{
    int i;
    float f = 1.0;
    for (i = 2; i <= n; i++)
    {
        f *= i;
    }
    return f;
}

int fatorial_rec (int n)
{
    if (n <= 1) return 1;
    return n * fatorial_rec(n-1);
}

int fibonacci (int n)
{
    if (n <= 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}

int main()
{
    // for (int i = 0; i<= 14; i++)
    // {
    //     printf("fatorial de %d = %.0f\n", i, fatorial(i));
    //     printf("fatorial de %d = %d\n", i, fatorial_rec(i))
    // }
    for ( int i = 1; i<= 40; i++)
    {
        printf("Fibonacci em %d: %d\n", i, fibonacci(i));
    }

    return 0;
}