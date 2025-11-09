def solution(my_string, is_prefix):
    return 1 if my_string[:len(is_prefix)] == is_prefix else 0