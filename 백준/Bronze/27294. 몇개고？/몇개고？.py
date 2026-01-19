T, S = map(int, input().split())

# 점심 시간(12~16)이고 술을 마시지 않는(0) 경우
if 12 <= T <= 16 and S == 0:
    print(320)
    
# 그 외의 모든 경우
else:
    print(280)