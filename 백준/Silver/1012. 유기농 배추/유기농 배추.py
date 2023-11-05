import sys

sys.setrecursionlimit(10 ** 6)
MAX = 50 + 10

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(y, x):
    global visited
    visited[y][x] = True
    for s in range(4):
        ny = y + dy[s]
        nx = x + dx[s]
        if graph[ny][nx] and not visited[ny][nx]:
            dfs(ny, nx)

t = int(sys.stdin.readline())
for _ in range(t):
    m, n, k = map(int, sys.stdin.readline().split())
    graph = [[False] * MAX for _ in range(MAX)]
    visited = [[False] * MAX for _ in range(MAX)]

    for _ in range(k):
        x, y = map(int, sys.stdin.readline().split())
        graph[y + 1][x + 1] = True

    answer = 0
    for i in range(n + 1):
        for j in range(m + 1):
            if graph[i][j] and not visited[i][j]:
                dfs(i, j)
                answer += 1

    print(answer)