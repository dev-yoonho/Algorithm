import sys

n = int(sys.stdin.readline())
temp = []
for i in range(2, 104):
    t = 0
    for j in range(2, i):
        if i % j == 0:
            t = 1
    if t == 0:
        temp.append(i)
for k in range(len(temp) - 1):
    if temp[k] * temp[k + 1] > n:
        print(temp[k] * temp[k + 1])
        break