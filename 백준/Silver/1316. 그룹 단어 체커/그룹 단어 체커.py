import sys

n = int(sys.stdin.readline())
answer = 0
for _ in range(n):
    word = sys.stdin.readline().rstrip()
    err = 0
    for i in range(len(word) - 1):
        if word[i] != word[i + 1]:
            new_word = word[i + 1:]
            if new_word.count(word[i]) > 0:
                err += 1
    if err == 0:
        answer += 1
print(answer)