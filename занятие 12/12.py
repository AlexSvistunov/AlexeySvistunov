#блок А, номер 3
def F(N):
	if len(N) == 0:
		return N
	else:
		return F(N[1:]) + N[0]
number = str(input('Введите ваше число: '))
print(F(number))