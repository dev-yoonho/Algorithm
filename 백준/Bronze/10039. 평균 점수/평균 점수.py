import sys

score = 0
for _ in range(5):
    if (n := int(sys.stdin.readline())) < 40:
        score += 40
    else:
        score += n
print(score // 5)