import sys

ans = 1
n = int(sys.stdin.readline())
for i in range(1, n + 1):
    ans *= i
print(ans)