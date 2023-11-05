import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
s = sys.stdin.readline().rstrip()

ans, i, cnt = 0, 0, 0

while i < (m - 1):
    if s[i:i + 3] == "IOI":
        i += 2
        cnt += 1
        if cnt == n:
            ans += 1
            cnt -= 1
    else:
        cnt = 0
        i += 1

print(ans)