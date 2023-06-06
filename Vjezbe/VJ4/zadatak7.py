def sort_list(lista):
    start = 0
    for i in range(len(lista)):
        if lista[i] % 2 == 1:
            swap2(lista, start, i)
            start += 1


def swap2(lista, first, second):
    if first != second and first < len(lista) and second < len(lista):
        lista[first], lista[second] = lista[second], lista[first]
    else:
        pass


if __name__ == '__main__':
    lsta = [23,2,4,40,15,7,200,10,5,8,9]
    print(lsta)
    sort_list(lsta)
    print(lsta)

