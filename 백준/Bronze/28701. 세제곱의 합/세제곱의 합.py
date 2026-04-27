import sys

n = int(sys.stdin.readline())
print(sum(list(range(1, n + 1))))
print(sum(list(range(1, n + 1))) ** 2)
print(sum([i ** 3 for i in range(1, n + 1)]))