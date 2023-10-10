import sys

n, m = map(int, sys.stdin.readline().split())
n_set, m_set = set(), set()
for _ in range(n):
    n_set.add(sys.stdin.readline().rstrip())
for _ in range(m):
    m_set.add(sys.stdin.readline().rstrip())
print(len(n_set & m_set))
for i in sorted(n_set & m_set):
    print(i)

