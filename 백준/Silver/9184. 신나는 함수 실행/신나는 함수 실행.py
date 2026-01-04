import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

memo = {}

def solve(a, b, c):
    global memo

    if a <= 0 or b <= 0 or c <= 0:
        memo[(a, b, c)] = 1
        return 1

    if (a, b, c) in memo:
        return memo[(a, b, c)]

    if a > 20 or b > 20 or c > 20:
        memo[(a, b, c)] = solve(20, 20, 20)
        return memo[(a, b, c)]
    
    if a < b and b < c:
        answer = solve(a, b, c-1) + solve(a, b-1, c-1) - solve(a, b-1, c)
    else:
        answer = solve(a-1, b, c) + solve(a-1, b-1, c) + solve(a-1, b, c-1) - solve(a-1, b-1, c-1)
    
    memo[(a, b, c)] = answer
    return answer

while True:
    a, b, c = map(int, input().split())

    if a == -1 and b == -1 and c == -1:
        break

    print(f"w({a}, {b}, {c}) = {solve(a, b, c)}")