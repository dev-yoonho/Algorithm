import sys

n = sys.stdin.readline().rstrip()

for i in range(0, len(n) // 10 +1):
    print(n[i * 10:10 + i * 10])