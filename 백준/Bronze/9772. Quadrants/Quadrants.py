import sys

input = sys.stdin.read().split()

it = iter(input)
for x_str in it:
    y_str = next(it)
    
    x = float(x_str)
    y = float(y_str)

    if x == 0 and y == 0:
        print("AXIS")
        break

    if x == 0 or y == 0:
        print("AXIS")
    elif x > 0 and y > 0:
        print("Q1")
    elif x < 0 and y > 0:
        print("Q2")
    elif x < 0 and y < 0:
        print("Q3")
    elif x > 0 and y < 0:
        print("Q4")