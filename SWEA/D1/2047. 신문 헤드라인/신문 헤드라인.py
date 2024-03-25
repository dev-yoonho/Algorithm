s = input()
print(''.join([i.upper() if i.islower() else i for i in s]))