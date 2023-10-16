import sys

while True:
    try:
        n, m = map(int, sys.stdin.readline().split())
    except:
        break
    else:
        print(m // (n + 1))