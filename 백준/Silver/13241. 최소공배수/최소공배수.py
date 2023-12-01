import sys

def lcm(n, k):
    temp = n * k
    while k > 0:
        n, k = k, n % k
    return temp // n

a, b = map(int, sys.stdin.readline().split())
if a < b:
    a, b = b, a
print(lcm(a, b))