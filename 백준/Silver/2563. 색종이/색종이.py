import sys

board = [[0 for _ in range(101)] for _ in range(101)]
n = int(sys.stdin.readline())

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())
    for i in range(x, x + 10):
        for j in range(y, y + 10):
            board[i][j] = 1
print(sum([k.count(1) for k in board]))