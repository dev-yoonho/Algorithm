n = int(input())
correct = list(input().rstrip())

# 각자의 패턴 정의
p1 = ['A', 'B', 'C'] * 35
p2 = ['B', 'A', 'B', 'C'] * 25
p3 = ['C', 'C', 'A', 'A', 'B', 'B'] * 20 

answer = {'Adrian': 0, 'Bruno': 0, 'Goran': 0}

# 점수 계산
for i in range(n):
    if correct[i] == p1[i]:
        answer['Adrian'] += 1
    if correct[i] == p2[i]:
        answer['Bruno'] += 1
    if correct[i] == p3[i]:
        answer['Goran'] += 1

# 최고 점수 구하기
max_score = max(answer.values())
print(max_score)

# 최고 점수를 받은 사람 모두 출력 (딕셔너리 순회)
for name, score in answer.items():
    if score == max_score:
        print(name)