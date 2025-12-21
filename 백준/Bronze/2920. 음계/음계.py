import sys
input = sys.stdin.readline

s = "".join(input().split())
print("ascending") if s == "12345678" else print("descending") if s == "87654321" else print("mixed")