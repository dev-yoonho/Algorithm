import sys

temp = sorted([[int(sys.stdin.readline()), i] for i in range(1, 9)], reverse = True)[:5]
print(sum([j[0] for j in temp]))
print(*sorted([k[1] for k in temp]))