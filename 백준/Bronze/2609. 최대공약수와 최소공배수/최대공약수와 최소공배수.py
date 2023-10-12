import sys
from math import gcd, lcm

n, m = map(int, sys.stdin.readline().split())
print(gcd(n, m))
print(lcm(n, m))