import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

if -pow(2, 15) <= n < pow(2, 15):
    print("short")
elif -pow(2, 31) <= n < pow(2, 31):
    print("int")
else:
    print("long long")