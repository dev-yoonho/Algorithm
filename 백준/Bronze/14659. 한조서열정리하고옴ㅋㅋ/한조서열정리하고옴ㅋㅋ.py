import sys

n = int(sys.stdin.readline())
h = list(map(int, sys.stdin.readline().split()))
max_num, cnt, answer = h[0], 0, []

for i in range(1, len(h)):
    if h[i] > max_num:
        max_num = h[i]
        answer.append(cnt)
        cnt = 0
    else:
        cnt += 1
    if i == len(h) - 1:
        answer.append(cnt)
print(max(answer)) if answer else print(cnt) 