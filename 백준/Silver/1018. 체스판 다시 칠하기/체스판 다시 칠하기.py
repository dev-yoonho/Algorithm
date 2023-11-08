import sys

n, m = map(int, sys.stdin.readline().split())
board = [sys.stdin.readline().rstrip() for _ in range(n)]
answer = []

for i in range(n - 7):
    for j in range(m - 7):
        w = 0
        b = 0
        for k in range(i, i + 8):
            for l in range(j, j + 8):
                if (k + l) % 2 == 0:
                    if board[k][l] != "W":
                        w += 1
                    else:
                        b += 1
                else:
                    if board[k][l] != "B":
                        w += 1
                    else:
                        b += 1
        answer.append(w)
        answer.append(b)

print(min(answer))