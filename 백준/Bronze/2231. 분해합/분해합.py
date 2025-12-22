import sys
input = sys.stdin.readline

n = int(input())

result = 0
for i in range(n//2, n):
    if (i + sum([int(j) for j in str(i)])) == n:
        result = i
        break
print(result)