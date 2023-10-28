import sys
from collections import deque

card = deque([i for i in range(1, int(sys.stdin.readline()) + 1)])
answer = []
for _ in range(len(card) - 1):
    answer.append(card[0])
    card.popleft()
    card.rotate(-1)
print(*answer, card[0])