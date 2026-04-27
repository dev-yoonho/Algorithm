import sys

num_list = [list(map(int, sys.stdin.readline().split())) for _ in range(9)]
print(max(map(max, num_list)))
for i in range(9):
    for j in range(9):
        if num_list[i][j] == max(map(max, num_list)):
            print(i + 1, j + 1)