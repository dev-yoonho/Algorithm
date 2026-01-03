import sys
input = sys.stdin.readline

def cnt_cards(n, cards):
    odd, even = 0, 0
    for i in cards:
        if i % 2 == 0:
            even += 1
        else:
            odd += 1
    if (even > odd and even % 2 != 0) or (even < odd and odd % 2 != 0):
        return "amsminn"
    return "heeda0528"


t = int(input())

for _ in range(t):
    n = int(input())
    cards = list(map(int, input().split()))

    # 채완이가 승리하기 위해선 무조건 한 장 이상 더 있는 부류여야 함
    # 홀과 짝의 갯수가 똑같으면 안되고, 더 많은 쪽이 홀수여야 함.
    # 더 많은 쪽이 짝수면 둘이 같은 부류를 고르는 순간 채완이가 가져갈게 없어서 짐
    print(cnt_cards(n, cards))