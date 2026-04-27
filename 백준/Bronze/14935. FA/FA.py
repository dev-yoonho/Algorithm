import sys

x = int(sys.stdin.readline())
try:
    while True:
        y = int(str(x)[0]) * len(str(x))
        if y == x:
            print("FA")
            break
        x = y
except:
    print("NFA")