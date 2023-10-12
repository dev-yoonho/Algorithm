import sys

n = int(sys.stdin.readline())
while n != -1:
    if sum([i for i in range(1, n) if n % i == 0]) != n:
        print(f'{n} is NOT perfect.')
    else:
        print(n, "=", " + ".join([str(i) for i in range(1, n) if n % i == 0]))
    n = int(sys.stdin.readline())