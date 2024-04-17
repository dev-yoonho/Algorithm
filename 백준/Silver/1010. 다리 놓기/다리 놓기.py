import sys

def fct(x):
    if x <= 1:
        return 1
    return x * fct(x-1)

t = int(sys.stdin.readline())

for _ in range(t):
    r, n = map(int, sys.stdin.readline().split())
    print(fct(n) // (fct(r)*fct(n-r)))