import sys

num = [int(sys.stdin.readline()) for _ in range(10)]
score, answer = 0, []
for i in range(len(num)):
    score += num[i]
    if score >= 100:
        answer.append(score)
        answer.append((score - num[i]))
        break
if answer != []:
    a, b = answer
if answer == []:
    print(score)
elif abs(a - 100) > abs(b - 100):
    print(b)
elif abs(a - 100) == abs(b - 100):
    print(max(a, b))
else:
    print(a)