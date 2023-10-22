import sys

n = int(sys.stdin.readline())
player = [sys.stdin.readline().rstrip()[0] for _ in range(n)]
answer = []
for i in set(player):
    if player.count(i) >= 5:
        answer.append(i)
if answer:
    print("".join(sorted(answer)))
else:
    print("PREDAJA")