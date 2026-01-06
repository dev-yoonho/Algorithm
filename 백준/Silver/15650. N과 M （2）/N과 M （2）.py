import sys
input = sys.stdin.readline

n, m = map(int, input().split())
result = []

def backtrack(start):
    if len(result) == m:
        print(*result)
        return

    for i in range(start, n + 1):
        result.append(i)

        backtrack(i+1)

        result.pop()

backtrack(1)