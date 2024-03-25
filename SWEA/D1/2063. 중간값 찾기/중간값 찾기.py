n = int(input())
print(sorted(list(map(int, input().split())), reverse=True)[n//2])