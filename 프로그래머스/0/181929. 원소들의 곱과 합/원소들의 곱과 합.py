def solution(num_list):
    m, s = 1, 0
    for i in num_list:
        m *= i; s += i
    return int(m < s**2)