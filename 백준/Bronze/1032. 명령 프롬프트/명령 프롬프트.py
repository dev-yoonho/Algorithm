import sys

n = int(sys.stdin.readline())

x = sys.stdin.readline().rstrip()
for _ in range(n - 1):
    y = sys.stdin.readline().rstrip()
    x = "".join([j if i == j else "?" for i, j in zip(x, y)])

print(x)