def solution(n):
    odd = sum([i for i in range(1, n+1, 2)])
    even_sq = sum([i ** 2 for i in range(0, n+1, 2)])
    return even_sq if n % 2 == 0 else odd 