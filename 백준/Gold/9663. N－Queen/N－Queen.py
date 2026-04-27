import sys
input = sys.stdin.readline

def check(x):
    for i in range(x):
        if row[x] == row[i] or abs(row[x] - row[i]) == abs(x - i):
            return False
    return True

def n_queen(x):
    global cnt

    if x == n:
        cnt += 1
        return

    for col in range(n):
        row[x] = col
        if check(x):
            n_queen(x+1)
    

n = int(input())

row = [0] * n
cnt = 0

n_queen(0)

print(cnt)