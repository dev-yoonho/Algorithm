import sys

n = int(sys.stdin.readline())
people = []
for _ in range(n):
    age, name = map(str, sys.stdin.readline().rstrip().split())
    people.append([int(age), name])
people.sort(key = lambda x: x[0])
for i in people:
    print(*i)