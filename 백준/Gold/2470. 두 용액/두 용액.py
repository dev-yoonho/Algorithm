import sys
from itertools import combinations

n = int(sys.stdin.readline())
value = sorted(list(map(int, sys.stdin.readline().split())))

min_num = sys.maxsize
start = 0
end = n - 1
result = []

while start < end:
    mix = value[start] + value[end]

    if abs(mix) < min_num:
        min_num = abs(mix)
        result = [value[start], value[end]]

    if mix < 0:
        start += 1
    elif mix > 0:
        end -= 1
    else:
        break
print(*result)