x = int(input("Введите число, не меньшее двух: "))
while x < 2:
    print("Неверное значение! Попробуйте снова!")
    x = int(input("Введите число, не меньшее двух: "))
else:
    def F(n):
        b = 1
        while b <= n:
            b = b+1
            if n % b == 0:
                return b
print("Наименьший натуральный делитель числа равен:", F(x))