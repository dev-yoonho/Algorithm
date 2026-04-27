import sys
import string

n, b = map(int, sys.stdin.readline().split())
tmp = string.digits + string.ascii_uppercase
def solution(num, base):
    q, r = divmod(num, base)
    if q == 0:
        return tmp[r]
    else:
        return solution(q, base) + tmp[r]
print(solution(n, b))
