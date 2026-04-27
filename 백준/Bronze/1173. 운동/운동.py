import sys

N, m, M, T, R = map(int, sys.stdin.readline().split())
time, cnt = 0, 0
x = m

while time < N:
    if m + T > M:
        break
    if x + T <= M:
        x += T
        time += 1
    else:
        x = max(x - R, m)
    cnt += 1
print(cnt if time == N else -1)