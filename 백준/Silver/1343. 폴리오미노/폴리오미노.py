import sys

board = sys.stdin.readline().rstrip().replace("XXXX", "AAAA").replace("XX", "BB")
print(-1) if "X" in board else print(board)