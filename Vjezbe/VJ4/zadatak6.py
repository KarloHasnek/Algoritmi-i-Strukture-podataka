def reverse_list(lista, start, end):
    if start >= end:
        return lista
    else:
        lista[start], lista[end] = lista[end], lista[start]
        start += 1
        end -= 1
        return reverse_list(lista, start, end)


if __name__ == '__main__':
    lista = [9, 86, 54, 97, 51, 3, 21, 32]
    print(lista)
    print(reverse_list(lista, 0, len(lista) - 1))

