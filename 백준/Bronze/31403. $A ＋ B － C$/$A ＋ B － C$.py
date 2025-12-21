n = []

for _ in range(3):
    n.append(int(input()))

print(n[0]+n[1]-n[2])
print(int(str(n[0]) + str(n[1])) - n[2])