def solution(num_list):
    for i, j in enumerate(num_list):
        if j < 0: return i 
    return -1