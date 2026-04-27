import sys

dial = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]
s = sys.stdin.readline().rstrip()
t_sum = 0
for i in dial:
    for j in i:
        for x in s:
            if x == j:
                t_sum += dial.index(i) + 3
print(t_sum)