import sys
input = sys.stdin.readline

n, k = map(int, input().split())

result = 0
place = 10

for i in range(1, n+1):
    if i == place:
        place *= 10

    result = (result * place + i) % k

print(result)