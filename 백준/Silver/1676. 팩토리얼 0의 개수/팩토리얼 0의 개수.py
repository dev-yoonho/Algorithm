import sys

n = int(sys.stdin.readline())
answer, cnt = 1, 1
for i in range(1, n + 1):
    answer *= i
answer = list(str(answer))

if len(answer) == 1:
    print(0)
else:
    for j in range(len(answer) - 1, 0, -1):
        if answer[j] != '0':
            print(len(answer) - 1 - j)
            break