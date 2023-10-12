import sys

n = sys.stdin.readline().rstrip()
while n != '0':
    if n == n[::-1]:
        print('yes')
    else:
        print('no')
    n = sys.stdin.readline().rstrip()