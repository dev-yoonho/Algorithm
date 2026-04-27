import sys 
input = sys.stdin.readline

m, f = map(int, input().split())

while m != 0 and f != 0:
    print(m + f)
    
    m, f = map(int, input().split())