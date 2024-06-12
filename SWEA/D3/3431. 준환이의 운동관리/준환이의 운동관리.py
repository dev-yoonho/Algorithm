T = int(input())

for i in range(1, T+1):
    L, U, X = map(int, input().split())
    if X > U:
        print(f"#{i} -1")
    elif X >= L and X <= U:
        print(f"#{i} 0")
    else:
        print(f"#{i} {L - X}")