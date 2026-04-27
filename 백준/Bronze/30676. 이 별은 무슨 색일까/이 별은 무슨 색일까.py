light = int(input())

if light < 425:
    print("Violet")
elif light < 450:
    print("Indigo")
elif light < 495:
    print("Blue")
elif light < 570:
    print("Green")
elif light < 590:
    print("Yellow")
elif light < 620:
    print("Orange")
else:
    print("Red")