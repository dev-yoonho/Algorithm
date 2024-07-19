import sys

t = int(sys.stdin.readline().strip())

for _ in range(t):
    a, b, c = map(int, sys.stdin.readline().strip().split())
    
    cnt = 0
    
    for x in range(1, a + 1):
        for y in range(1, b + 1):
            for z in range(1, c + 1):
                if x % y == y % z and y % z == z % x:
                    cnt += 1
    

    print(cnt)