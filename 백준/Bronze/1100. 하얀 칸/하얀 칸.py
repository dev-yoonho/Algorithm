import sys

cnt = 0
for i in range(8):
    if i % 2 == 0:
        line = sys.stdin.readline().rstrip()[::2]
        cnt += line.count('F')
    else:
        line = sys.stdin.readline().rstrip()[1::2]
        cnt += line.count('F')
print(cnt)