import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def backtrack():
    if len(result) == m:
        print(*result)
        return

    for i in range(1, n+1):
        result.append(i)
        backtrack()
        result.pop()



n, m = map(int, input().split())
result = []

backtrack()