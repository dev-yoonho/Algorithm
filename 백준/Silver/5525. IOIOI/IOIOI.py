import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
s = sys.stdin.readline().rstrip()

p = "I" + ("OI" * n)
num, cnt = len(p) - 1, 0

for i in range(0, len(s) - num):
    if s[i:i + num + 1] == p:
        cnt += 1

print(cnt)