import sys
from collections import deque

input = sys.stdin.readline

total = int(input())

for _ in range(9):
    total -= int(input())

print(total)