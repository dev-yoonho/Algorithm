import sys
from collections import deque

input = sys.stdin.readline

bits = list(map(int, input().split()))

if 9 in bits:
    print("F")
else:
    print("S")