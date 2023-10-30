import sys

n = int(sys.stdin.readline())
people = []
for _ in range(n):
    temp = list(map(str, sys.stdin.readline().rstrip().split()))
    people.append([int(i) if i.isdigit() else i for i in temp])
people.sort(key = lambda x: (x[3], x[2], x[1]))
print(people[-1][0])
print(people[0][0])