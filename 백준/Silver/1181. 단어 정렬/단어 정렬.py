import sys

n = int(sys.stdin.readline())
words = []
for _ in range(n):
    words.append(sys.stdin.readline().rstrip())
word_list = list(set(words))
word_list.sort()
word_list.sort(key=len)
for i in word_list:
    print(i)