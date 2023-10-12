import sys

def round2(n):
    return int(n) + (1 if n - int(n) >=0.5 else 0)

n = int(sys.stdin.readline())
temp = []
if n == 0:
    print(0)
else:
    for _ in range(n):
        temp.append(int(sys.stdin.readline()))
    x = round2(n * 0.15)
    temp.sort()
    temp = temp[x:n-x]
    if len(temp) == 0:
        print(0)
    else:
        print(round2(sum(temp) / len(temp)))
