import sys
from collections import deque

s = list(sys.stdin.readline().rstrip())
temp = []

for i in range(1, len(s) - 1):
    for j in range(i + 1, len(s)):
        a = s[:i]
        b = s[i:j]
        c = s[j:]
        a.reverse()
        b.reverse()
        c.reverse()
        temp.append("".join(a + b + c))

print(sorted(temp)[0])