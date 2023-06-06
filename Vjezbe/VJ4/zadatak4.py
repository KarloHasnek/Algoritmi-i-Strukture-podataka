from random import randint


def random_array(list_size, miny, maxy):
    our_list = [randint(miny, maxy + 1) for _ in range(list_size)]
    return our_list


def sum_n_nums_from_array(lst, n):
    our_sum = 0
    if n < len(lst):
        for i in range(n):
            our_sum += lst[i]
    else:
        our_sum = "Input is not correct!"
    return our_sum


if __name__ == '__main__':
    lista = random_array(10, 1, 20)
    print(f"our list is:\n{lista}")
    broj_elemenata = 5
    suma = sum_n_nums_from_array(lista, broj_elemenata)
    print(f"sum of first {broj_elemenata} elements in our list is: {suma}")
