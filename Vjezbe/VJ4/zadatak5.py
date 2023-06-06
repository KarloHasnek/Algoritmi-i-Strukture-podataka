from zadatak4 import *


def binary_search(lst, value):
    low = 0
    high = len(lst) - 1

    while low <= high:
        mid = (low + high) // 2
        if lst[mid] == value:
            return mid
        elif lst[mid] < value:
            low = mid + 1
        else:
            high = mid - 1

    return -1


if __name__ == '__main__':
    lista = random_array(10, 1, 20)
    print(lista)
    res = binary_search(lista, 7)
    if res == -1:
        print("Trazeni broj nije unutar liste")
    else:
        print(f"trazeni broj se nalazi na indesknoj poziciji: {res}")
        print(f"odnosno na {res+1}. poziciji po prikazanom")
