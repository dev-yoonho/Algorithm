import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

def star_point(n):
    if n == 1:
        return ["*"]

    stars = star_point(n // 3)

    top = []
    for s in stars:
        top.append(s * 3)

    mid = []
    for s in stars:
        mid.append(s + " " * (n // 3) + s)

    return top + mid + top

print("\n".join(star_point(n)))