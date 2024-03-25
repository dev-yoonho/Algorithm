t = int(input())

for i in range(t):
    a, b = map(int, input().split())
    a, b = divmod(a, b)
    print(f"#{i+1} {a} {b}")