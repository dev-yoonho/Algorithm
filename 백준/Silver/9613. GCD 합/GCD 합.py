import sys
from itertools import combinations

def gcd(a, b):
    if a < b:
        a, b = b, a
    while b > 0:
        a, b = b, a % b
    return a

t = int(sys.stdin.readline())
for _ in range(t):
    temp = list(map(int, sys.stdin.readline().split()))
    temp.pop(0)
    print(sum([gcd(i, j) for i, j in list(combinations(temp, 2))]))