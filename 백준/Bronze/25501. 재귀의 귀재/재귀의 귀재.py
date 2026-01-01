import sys
input = sys.stdin.readline

cnt = 0

def recursion(s, l, r, cnt):
    if l >= r: # 더 이상 비교할 것이 없는데 그동안 오류가 안 났으니 팰린드롬
        cnt += 1
        return [1, cnt]
    elif s[l] != s[r]: # 대칭으로 동일한 위치의 문자가 다를 경우 팰린드롬이 아님
        cnt += 1
        return [0, cnt]
    else:
        cnt += 1
        return recursion(s, l+1, r-1, cnt)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1, 0) # 문자열, 0, 문자열의 길이 - 1

t = int(input())

for _ in range(t):
    print(*isPalindrome(input().rstrip()))