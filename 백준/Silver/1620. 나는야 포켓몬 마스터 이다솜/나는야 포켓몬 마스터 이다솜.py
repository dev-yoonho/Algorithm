import sys

n, m = map(int, sys.stdin.readline().split())
temp = dict()
for i in range(1, n+1):
    a = sys.stdin.readline().rstrip()
    temp[i] = a
    temp[a] = i
for j in range(m):
    question = sys.stdin.readline().rstrip()
    if question.isdigit():
        print(temp[int(question)])
    else:
        print(temp[question])