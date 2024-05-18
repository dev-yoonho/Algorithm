import sys  # 빠른 표준 입출력을 위해 sys 라이브러리를 임포트

one = sys.stdin.readline().strip()  # 첫 번째 핸드폰 번호 입력 받기
two = sys.stdin.readline().strip()  # 두 번째 핸드폰 번호 입력 받기
temp = ""  # 궁합률을 계산하기 위한 임시 변수

# 두 번호의 각 숫자를 번갈아 가며 병합
for i in range(8):
    temp += one[i] + two[i]

while len(temp) > 2:  # 궁합률이 두 자리가 될 때까지 반복
    result = ""  # 임시 결과를 저장할 문자열 초기화
    for j in range(len(temp) - 1):
        result += str((int(temp[j]) + int(temp[j+1])) % 10)  # 두 숫자를 더한 결과의 일의 자리만 추가
    temp = result  # 계산된 결과를 temp에 저장

print(temp)  # 최종 궁합률 출력
