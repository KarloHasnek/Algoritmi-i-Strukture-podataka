from random import randint
from typing import *
from timeit import default_timer as timer


def find_maximum(lst: List) -> int:
    k = 1
    maximum = lst[0]

    while k < len(lst):
        if lst[k] > maximum:
            maximum = lst[k]
        k += 1

    return maximum


def find_max_idx(lst: List) -> Tuple:
    k = 0
    maximum = lst[k]
    idx = 0

    while k < len(lst):
        if lst[k] > maximum:
            maximum = lst[k]
            idx = k
        k += 1

    return maximum, idx


def swap_two(left: int, indx: int, lst: List):
    """
    Function that swaps 2 elements of list.
    :param left: index position of left element
    :param indx: index position of the right element
    :param lst: list that contains elements
    :return: list with swapped elements
    """

    temp = lst[left]
    lst[left] = lst[indx]
    lst[indx] = temp

    return lst


def sort_swap(lst: List) -> List:
    """
    Function that sorts in descending order using simple swapping procedure
    by identifying max value and its position.
    :param lst: unsorted list
    :return: sorted list
    """

    k = 0

    while k < len(lst)-1:
        maxi, indx = find_max_idx(lst[k:])
        lst = swap_two(k, indx+k, lst)
        k += 1

    print(f"Sorted list: {lst}")
    return lst


def generate_random_list(num_elements: int, mini: int = -10, maxi: int = 100) -> List:
    lst = []

    for i in range(num_elements):
        rndint = randint(mini, maxi)
        lst.append(rndint)

    return lst


def elapsed_time(alg: Callable, lst: List) -> float:

    start = timer()
    alg(lst)
    end = timer()

    return end - start


if __name__ == '__main__':
    lst = generate_random_list(7)
    print(f'Unsorted list: {lst}')

    #print(f'maximum is: {find_maximum(lst)}')
    #mx, indx = find_max_idx(lst)
    #print(f'Maximum is: {mx} | index is: {indx}')
    #lst = swap_two(0, indx, lst)
    #print(lst)
    #lst = sort_swap(lst)
    #print(lst)

    elapsed = elapsed_time(sort_swap, lst)
    print(f'Time elapsed: {elapsed}')
