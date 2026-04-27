import sys

a, b = map(int, sys.stdin.readline().split())

arr = [0]
for i in range(1, b + 1):
    for _ in range(i):
        arr.append(i)
print(sum(arr[a:b + 1]))