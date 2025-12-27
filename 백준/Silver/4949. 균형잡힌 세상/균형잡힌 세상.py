import sys
input = sys.stdin.readline

while True:
    s = input().rstrip()
    if s == '.':
        break
    
    paren_list = [i for i in s if i in ["[", "]", "(", ")"]]
    temp_list = []

    while True:
        try:
            temp_list.append(paren_list.pop(0))
            if temp_list[-2:] in [["(", ")"], ["[", "]"]]:
                paren_list = temp_list[:-2] + paren_list
                temp_list = []
        except Exception:
            break
    print("no") if len(temp_list) > 0 else print("yes")