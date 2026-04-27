N = int(input())

height = 2 * N
width = 4 * N + 2

for i in range(height):
    line = [' '] * width

    line[2 * N - 1 - i] = '*'

    if i < N:
        line[3 * N - i] = '*'
        line[3 * N + 2 + i] = '*'
    else:
        line[i + N + 1] = '*'
        line[5 * N + 1 - i] = '*'

    print(''.join(line))
