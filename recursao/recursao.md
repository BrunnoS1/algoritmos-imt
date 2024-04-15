# RECURSÃO

## Exemplo - Fatorial
<br/>
Fatorial de um número se dá por:

```
Fatorial(n) = 
    • 1, se n <= 1
    • n * Fatorial(n - 1), se n > 1
```

### Em C

Cálculo padrão do fatorial de um número
```c
int fatorial (int n)
{
    int i, f=1;
    for (i = 2; i <= n; i++)
    {
        f *= i;
    }
    return f;
}
```
<br/>

Toda recursão tem um critério de parada  
Cálculo de fatorial com recursividade

```c
int fatorial_rec (int n)
{
    if (n <= 1) return 1;
    return n * fatorial_rec(n-1);
}
```

<strong>Pilha recursiva - para cada entrada 1 chamada</strong>

## Exemplo - Fibonacci
Fibonacci em um número se dá por:
```
Fibonacci(n) = 
    • 1, se n <= 1
    • Fibonacci(n - 1) + Fibonacci(n-2)
```

### Em C
Com recursão
```c
int fibonacci (int n)
{
    if (n <= 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}
```

<strong>Árvore recursiva - para cada entrada 2 chamadas</strong>