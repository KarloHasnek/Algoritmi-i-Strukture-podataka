import random

def transform_string_to_data_structure(input_string):
    # Transformacija stringa u pripadnu strukturu podataka
    return list(input_string.split())

def random_search(inpt, some_wrd):
    random.seed(123)  # Postavljanje seed-a generatora slučajnih brojeva
    data = inpt.copy()

    while len(data) > 0:
        random_index = random.randint(0, len(data) - 1)
        print("Random index to test:", random_index)
        if data[random_index] == some_wrd:
            print(f"Tražena riječ '{some_wrd}' pronađena na poziciji {random_index}.")
            break
        else:
            print(f"Removing: {data[random_index]}")
            data.pop(random_index)

    if len(data) == 0:
        print(f"Status: False")

# Primjer korištenja
some_string = "this is some string that will be used in the code"
some_wrd = "strings"

inpt = transform_string_to_data_structure(some_string)
random_search(inpt, some_wrd)
