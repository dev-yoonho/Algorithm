import sys

word_list = [list(map(str, sys.stdin.readline().rstrip().split())) for _ in range(5)]
word_list = [list(*word_list[i]) for i in range(len(word_list))]
answer = ""
for i in range(15):
    for j in range(5):
        try:
            answer += word_list[j][i]
        except:
            continue
print(answer)