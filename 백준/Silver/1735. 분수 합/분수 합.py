import sys

def gcd(n, k):
    if n < k:
        n, k = k, n
    temp = n * k
    while k > 0:
        n, k = k, n % k
    return n

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())
mother = b * d
child  = a * d + b * c
crit = gcd(child, mother)
print(f"{child // crit} {mother // crit}")