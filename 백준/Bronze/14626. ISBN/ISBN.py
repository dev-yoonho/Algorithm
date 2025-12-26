import sys
input = sys.stdin.readline

n = input().rstrip()
num_list = [int(j) if j.isnumeric() and (i % 2 == 0) else int(j) * 3 if j.isnumeric() and (i % 2 != 0) else j for i, j in enumerate(n)]

total = sum([k for k in num_list if type(k) == int])
weight = 1 if num_list.index('*') % 2 == 0 else 3

for x in range(10):
    _, piece = divmod(total + weight * x, 10)
    if piece == 0:
        print(x)
        break