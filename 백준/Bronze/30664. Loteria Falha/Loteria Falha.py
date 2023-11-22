import sys

n = int(sys.stdin.readline())
while n != 0:
    if n % 42 == 0:
        print("PREMIADO")
    else:
        print("TENTE NOVAMENTE")
    n = int(sys.stdin.readline())