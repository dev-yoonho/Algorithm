import sys

n = int(sys.stdin.readline())
while True:
    if str(n).replace('4', '').replace('7', '') == '':
        print(n)
        break
    n -= 1