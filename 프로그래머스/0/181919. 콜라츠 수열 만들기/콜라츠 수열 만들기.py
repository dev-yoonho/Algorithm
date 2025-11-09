def solution(n):
    answer = [n]
    while 1:
        if n == 1: return answer
        if n % 2 == 0:
            answer.append(n := n // 2)
        else: answer.append(n := 3 * n + 1)
            