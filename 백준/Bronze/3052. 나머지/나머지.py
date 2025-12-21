import sys
input = sys.stdin.readline

n = []
for _ in range(10):
    n.append(int(input()) % 42)
print(len(set(n)))