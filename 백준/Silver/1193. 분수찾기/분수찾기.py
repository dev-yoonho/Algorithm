[1/1], [1/2, 2/1], [3/1, 2/2, 1/3], [1/4, 2/3, 3/2, 4/1]
import sys

x = int(sys.stdin.readline())
line = 1
while x > line:
    x -= line
    line += 1
if line % 2 == 0:
    a = x
    b = line - x + 1
else:
    a = line - x + 1
    b = x
print(f"{a}/{b}")