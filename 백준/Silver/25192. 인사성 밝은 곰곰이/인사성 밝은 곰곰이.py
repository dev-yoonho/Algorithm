import sys
input = sys.stdin.readline

n = int(input())

chat = set()
greet = 0

for _ in range(n):
     nick = input().rstrip()
     if nick == "ENTER":
         chat.clear()
     else:
         if nick not in chat:
             greet += 1
             chat.add(nick)

print(greet)