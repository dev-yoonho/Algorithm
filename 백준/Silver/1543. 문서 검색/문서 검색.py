docu = input()
word = input()
cnt = 0
while word in docu:
    docu = docu.replace(word, " ", 1)
    cnt += 1
print(cnt)