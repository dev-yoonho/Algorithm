import sys

n = int(sys.stdin.readline())
d = [0] * 41
d[0], d[1] = 1, 1

def fibo(x):
    if d[x] == 0:
        d[x] = fibo(x - 1) + fibo(x - 2)
    return d[x]

print(fibo(n - 1), n - 2)