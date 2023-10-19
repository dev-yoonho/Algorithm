import sys
import math

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())
n_list = []

def primenumber(x):
    if x == 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

for i in range(m, n + 1):
    if primenumber(i):
        n_list.append(i)

if n_list:
    print(sum(n_list))
    print(min(n_list))
else:
    print(-1)