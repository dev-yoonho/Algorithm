import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def cantor(s):
    length = len(s)
    if length != 1:
        sep_one = length // 3
        sep_two = length // 3 * 2
        
        first = s[:sep_one] # 0:9 
        second = " " * sep_one
        third = s[sep_two:] # 18:26

        return cantor(first) + second + cantor(third)
    else:
        return "-"

while True:
    try:
        n = int(input())
        s = "-" * (3**n)
        print(cantor(s))
    except Exception:
        break