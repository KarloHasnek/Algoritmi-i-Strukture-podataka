from typing import *
from timeit import default_timer as timer


def sort_simple_cycling(lst: List, order: str = "desc") -> List:
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
                if lst[p] < lst[q]:
                    lst[p] = lst[q]
                    lst[q] = temp
            else:
                if lst[p] > lst[q]:
                    lst[p] = lst[q]
                    lst[q] = temp

    print(f"Sorted: {lst}")
    return lst


def iterate_dictionary(dicti: Dict):
    for key,value in dicti.items():
        print(f"Key: {key}\nValue: {value}")


def elapsed_time(alg: Callable, lst: List) -> float:

    start = timer()
    alg(lst)
    end = timer()

    return end - start


if __name__ == '__main__':
    lst = [3, -11, 77, 0, 100, 43, -89]
    sort_simple_cycling(lst)
    sort_simple_cycling(lst, "asc")
    elapsed = elapsed_time(sort_simple_cycling, lst)
    print(elapsed)
    #sort_simple_cycling(lst, order="asci")

    dicti = {'a': 1, 'b': 3, 'c': 10}
    iterate_dictionary(dicti)

