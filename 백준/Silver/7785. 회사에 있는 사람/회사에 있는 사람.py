import sys

n = int(sys.stdin.readline())
temp = dict()
for _ in range(n):
     a, b = map(str, sys.stdin.readline().rstrip().split())
     if b == "enter":
         temp[a] =b
     else:
         del temp[a]

temp = sorted(temp.keys(), reverse = True)
for i in temp:
    print(i)