import sys
import string

n = int(sys.stdin.readline())
word = sys.stdin.readline().rstrip()
alpha = dict()
for i, j in enumerate(string.ascii_lowercase):
    alpha[j] = i + 1
print(sum([alpha[l] * (31 ** k) for k, l in enumerate(word)]))