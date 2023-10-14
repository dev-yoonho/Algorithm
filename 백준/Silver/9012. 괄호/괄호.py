import sys
from collections import deque

def solution(s):
    sopen, sclose = 0, 0
    for i in s:
        if i == "(":
            sopen += 1
        else:
            sclose += 1
        if sopen < sclose:
            return False
    return list(s).count("(") == list(s).count(")")

t = int(sys.stdin.readline())

for _ in range(t):
    s = sys.stdin.readline().rstrip()
    if solution(s) == True:
        print("YES")
    else:
        print("NO")

