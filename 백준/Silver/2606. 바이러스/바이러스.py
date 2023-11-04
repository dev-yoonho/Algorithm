import sys

def dfs(idx):
    global visited, cnt
    visited[idx] = True
    cnt += 1
    for next in range(1, n + 1):
        if not visited[next] and graph[idx][next]:
            dfs(next)
            
n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

graph = [[False] * (n + 1) for _ in range(n + 1)]
visited = [False] * (n + 1)
cnt = 0
 
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = True
    graph[b][a] = True

dfs(1)
print(cnt - 1)