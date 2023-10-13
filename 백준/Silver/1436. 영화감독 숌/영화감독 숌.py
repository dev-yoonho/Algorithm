import sys

n = int(sys.stdin.readline())
fix_n, cnt = 666, 0

while True:
    if '666' in str(fix_n):
        cnt += 1
    if cnt == n:
        print(fix_n)
        break
    fix_n += 1