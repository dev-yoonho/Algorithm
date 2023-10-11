import sys
from collections import Counter

n = int(sys.stdin.readline())
n_cardlist = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
m_numberlist = list(map(int, sys.stdin.readline().split()))

count = Counter(n_cardlist)

for i in m_numberlist:
    print(count[i], end=' ')