import sys

a, b = map(int, sys.stdin.readline().split())
if a > b:
    a, b = b, a

result = (a + b) * ((b - a + 1) // 2)
if (b - a) % 2 == 0:
    result += (a + b) // 2
print(result)