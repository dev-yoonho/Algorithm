import sys
from math import ceil
input = sys.stdin.readline

n = int(input())
t_n = list(map(int, input().split()))
t, p = map(int, input().split())

print(sum([ceil(i/t) for i in t_n]))
print(*divmod(n, p))