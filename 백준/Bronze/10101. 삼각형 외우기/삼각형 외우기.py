import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
c = int(sys.stdin.readline())
if a == b == c == 60:
    print("Equilateral")
elif a + b + c == 180:
    if len(set([a, b, c])) == 2:
        print("Isosceles")
    elif len(set([a, b, c])) == 3:
        print("Scalene")
else:
    print("Error")