import sys
input = sys.stdin.readline

total = int(input())
diff = int(input())

x = (total - diff) // 2

print(total - x)
print(x)