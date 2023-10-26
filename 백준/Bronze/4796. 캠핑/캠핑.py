import sys

l, p, v = map(int, sys.stdin.readline().split())
cnt = 1
while l != 0 or p != 0 or v != 0:
    print(f"Case {cnt}: {v // p * l + min(v % p, l)}")
    l, p, v = map(int, sys.stdin.readline().split())
    cnt += 1