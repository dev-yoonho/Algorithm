import sys

n_list = sorted(list(map(int, sys.stdin.readline().split())))
while 0 not in n_list:
    if n_list[0] + n_list[1] <= n_list[2]:
        continue
    if n_list[0] ** 2 + n_list[1] ** 2 == n_list[2] ** 2:
        print("right")
    else:
        print("wrong")
    n_list = sorted(list(map(int, sys.stdin.readline().split())))
