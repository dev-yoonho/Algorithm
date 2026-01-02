import sys
input = sys.stdin.readline

dish = [i for i in input().rstrip()]

result = 10
for i in range(1, len(dish)):
    if dish[i] != dish[i-1]:
        result += 10
    else:
        result += 5

print(result)