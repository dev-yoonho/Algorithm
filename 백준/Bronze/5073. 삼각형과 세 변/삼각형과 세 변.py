import sys

a, b, c = map(int, sys.stdin.readline().split())
while a != 0:
    temp, temp2 = [a, b, c], [a, b, c]
    a = max(a, b, c)
    temp.pop(temp.index(a))
    b, c = temp

    if a >= b + c:
        print("Invalid")
    elif len(set(temp2)) == 3:
        print("Scalene")
    elif a == b == c:
        print("Equilateral")
    else:
        print("Isosceles")
    a, b, c = map(int, sys.stdin.readline().split())