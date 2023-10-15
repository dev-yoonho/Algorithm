import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())
people = deque([i for i in range(1, n + 1)])
answer = []

while people:
    people.rotate(-k + 1)
    answer.append(people.popleft())

print("<", end = "")
print(*answer, sep = ", ", end ="")
print(">")