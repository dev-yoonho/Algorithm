import sys
from itertools import combinations

n, m = map(int, sys.stdin.readline().split())
card = list(map(int, sys.stdin.readline().split()))

temp = [sum(i) for i in list(combinations(card, 3))]
temp.sort(reverse = True)
for i in temp:
    if i <= m:
        print(i)
        break