def reverse_order(any_input):
    lista = []
    if isinstance(any_input, list):
        reverse(any_input, lista)
        return lista
    elif isinstance(any_input, str):
        any_input = list(any_input)
        reverse(any_input, lista)
        return "".join(lista)
    elif isinstance(any_input, tuple):
        any_input = list(any_input)
        reverse(any_input, lista)
        return tuple(lista)
    else:
        return "Unsupported type"


def reverse(in1, aux):
    while in1:
        aux.append(in1.pop())
# dio koji koristi princip rada stoga


if __name__ == '__main__':
    inp = [11, -23, 90, 87, 54, 78, 0, -12, 33, 45, 67, 89, 90, 11, 23, 45, 67, 89, 90]
    some_string = "ovo je neki string koji nam treba za testiranje"
    any_input = (1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    # print obrnut redoslijed za inp
    print(reverse_order(inp))
    # print obrnut redoslijed za some_string
    print(reverse_order(some_string))
    # print za obrnut redoslijed za any_input
    print(reverse_order(any_input))
    