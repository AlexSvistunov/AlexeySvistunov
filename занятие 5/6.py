def F():
    x = int(input("Введите число: "))
    s = 0
    i = 0
    p = 0
    while x != 0:
        i += 1
        s += x
        x = int(input("Введите число: "))
        p = s / i
    return(p)
print("Среднее значение элементов последовательности равно:",F())