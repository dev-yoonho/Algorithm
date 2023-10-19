import sys
from itertools import combinations

small = [int(sys.stdin.readline()) for _ in range(9)]

smallC7 = list(combinations(small, 7))

for i in smallC7:
    if sum(i) == 100:
        temp = sorted(list(i))
        for j in temp:
            print(j)
        break