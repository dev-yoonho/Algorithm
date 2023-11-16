import sys

l = int(sys.stdin.readline())
print(l // 5) if l % 5 == 0 else print(l // 5 + 1)