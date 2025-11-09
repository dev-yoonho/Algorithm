def solution(a, b):
    return max(int((a:=str(a))+(b:=str(b))), int(b+a))