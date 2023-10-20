import sys

print(sum(num := [int(sys.stdin.readline()) for _ in range(5)]) // 5)
print(sorted(num)[len(num) // 2])