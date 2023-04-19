from sort_ascending import elapsed_time, sort_swap, generate_random_list
from sort_descending import elapsed_time as et2
from sort_descending import sort_swap as ss2


def user_input() -> 0:
    print("Unesite asc ili desc kako biste sortirali listu uzlazno ili silazno: ")
    state = input()
    if state == "asc":
        print(elapsed_time(sort_swap, lst))
    elif state == "desc":
        print(et2(ss2, lst))
    else:
        print("Oops. Error, Input was incorrect, please try again...")


if __name__ == '__main__':
    lst = generate_random_list(7)
    print(f'Unsorted list: {lst}')
    user_input()

