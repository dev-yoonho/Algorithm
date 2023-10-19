import sys

n, k = map(int, sys.stdin.readline().split())
worth, cnt = [], 0
for _ in range(n):
    worth.append(int(sys.stdin.readline()))

for i in worth[::-1]:
    cnt += k // i
    k %= i

print(cnt)