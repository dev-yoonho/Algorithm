import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
A = list(map(int, input().split()))

B = sorted([i for i in A])

P = [] 
for i in A:
    P.append(B.index(i))
    B[B.index(i)] = -1

print(*P)

# A = [2, 3, 1]
# B = [1, 2, 3]
# P = [1, 2, 0]
# B[1] = 2 / B[2] = 3 / B[0] = 1