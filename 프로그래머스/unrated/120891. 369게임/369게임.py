def solution(order):
    return len([i for i in str(order) if int(i) in [3, 6, 9]])