import sys

n = int(sys.stdin.readline())
cardlist = set(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
integer = list(map(int, sys.stdin.readline().split()))

for i in integer:
    if i in cardlist:
        print(1, end = ' ')
    else:
        print(0, end = ' ')