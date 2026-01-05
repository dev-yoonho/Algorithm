import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def backtracking():
    if len(result) == m:
        print(*result)
        return

    for i in range(1, n+1):
        if not visited[i]:
            visited[i] = True
            result.append(i)

            backtracking()

            result.pop()
            visited[i] = False

n, m = map(int, input().split())

visited = [False] * (n+1)
result = []

backtracking()