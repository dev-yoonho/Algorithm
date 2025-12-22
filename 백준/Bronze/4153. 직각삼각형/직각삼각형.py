import sys
input = sys.stdin.readline

while True:
    n_list = list(map(int, input().split()))
    if n_list.count(0) > 0:
        break
    n_list.sort()
    print("right") if pow(n_list[2], 2) == (pow(n_list[0], 2) + pow(n_list[1], 2)) else print("wrong")