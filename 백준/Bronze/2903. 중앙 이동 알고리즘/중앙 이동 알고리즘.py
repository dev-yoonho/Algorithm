import sys

n = int(sys.stdin.readline())

a, b = 2, 1
for i in range(n):
    a += b
    b *= 2
print(a ** 2)