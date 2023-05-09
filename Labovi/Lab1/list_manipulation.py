import random
from typing import List

alphabet = "laesfhucnLYEIAWGTNC9841"

lista_alph = []

for a in alphabet:
    lista_alph.append(a)


def list_generator(num_elements: int = 10):

    global strng, lista_rand_gen_str

    if num_elements < 1:
        quit()
    else:
        lista_rand_gen_str = []

        for _ in range(num_elements):

            strng = ""

            for _ in range(random.randint(3, 15)):
                strng += lista_alph[random.randint(0, len(lista_alph)-1)]

            lista_rand_gen_str.append(strng)

    return lista_rand_gen_str


def sort1(lst: List, order: str = "desc") -> List:
    if order == "desc":
        order = False
    else:
        order = True

    sorted_lst = sorted(lst, reverse=order)

    return sorted_lst


def sort2(lst: List, order: str = "desc") -> List:
    """
    Function that sorts unsorted list using simple circle method.
    :param lst: unsorted list
    :param order: ascending or descending
    :return: sorted list
    """

    assert order in ["asc", "desc"]

    for p in range(len(lst)-1):
        for q in range(p+1, len(lst)):
            temp = lst[p]
            if order == "desc":
                if lst[p] > lst[q]:
                    lst[p] = lst[q]
                    lst[q] = temp
            else:
                if lst[p] < lst[q]:
                    lst[p] = lst[q]
                    lst[q] = temp

    return lst


if __name__ == '__main__':

    lst = list_generator()
    sorted1 = sort1(lst)
    sorted2 = sort2(lst)
    sorted1asc = sort1(lst, "asc")
    sorted2asc = sort2(lst, "asc")

    print(f'Test-default: {sorted1asc == sorted2asc}')
    print(f'Test-desc one: {sorted1 == sorted2}')
    print(f'Test-desc all: {sorted1asc == sorted2}')

