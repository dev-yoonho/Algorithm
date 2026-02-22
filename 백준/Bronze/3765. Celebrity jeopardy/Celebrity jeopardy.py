import sys

input = sys.stdin.readline

while True:
    line = input()
    
    if not line:
        break
        
    print(line.strip())