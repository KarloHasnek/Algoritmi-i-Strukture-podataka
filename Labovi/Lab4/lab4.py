# import
from random import randint


# define algorih for random search
def rand_search(inpt: str, some_wrd: str) -> bool:
    data = inpt.copy()

    while len(data) > 0:
        random_index = randint(0, len(data) - 1)
        if data[random_index] == some_wrd:
            print(f"Tražena riječ '{some_wrd}' pronađena na poziciji {random_index}.")
            break
        else:
            print(f"Tražena riječ '{some_wrd}' nije pronađena na poziciji {random_index}.")
            data.pop(random_index)

    if len(data) == 0:
        print(f"Tražena riječ '{some_wrd}' nije pronađena.")


