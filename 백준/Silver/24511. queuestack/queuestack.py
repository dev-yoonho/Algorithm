import sys
input = sys.stdin.readline

n = int(input()) # 자료구조의 개수
A = list(map(int, input().split())) # 길이 n인 수열 A
B = list(map(int, input().split())) # i번 자료구조에 들어있는 원소
M = int(input()) # 삽입할 수열 길이
C = list(map(int, input().split())) # 삽입할 원소의 수열

single_queue = [B[i] for i in range(n) if A[i] == 0]

single_queue.reverse()
single_queue += C

print(*single_queue[:M])