from typing import List, Tuple


def read_data_as_list(file_name: str) -> List[str]:
    """
    Reads the data from the file and returns the list of strings
    Args:
        file_name: name of the file

    Returns:
        list of strings
    """
    lista = []
    f = open(file_name, "r")
    for line in f:
        lista.append(line)

    return lista


def convert_to_numbers(slst: List[str]) -> List:
    """
    Converts the list of strings to the list of integers
    and floats
    Args:
        slst: list of strings

    Returns:
        list of floats and integers
    """
    for i in range(len(slst)):
        try:
            slst[i] = int(slst[i])
        except:
            slst[i] = float(slst[i])
    return slst


def eliminate_duplicates(iflst: List) -> List:
    """
    Eliminates the duplicates from the list
    Args:
        iflst: list of integers and floats

    Returns:
        list of integers and floats without duplicates
    """
    lista_bez_duplikata = []
    for i in iflst:
        if i not in lista_bez_duplikata:
            lista_bez_duplikata.append(i)
    return lista_bez_duplikata


def find_pos_neg_ints(filst: List) -> Tuple:
    pos = []
    neg = []

    for i in filst:
        if isinstance(i, int):
            if i < 0:
                neg.append(i)
            elif i > 0:
                pos.append(i)
    return tuple(pos), tuple(neg)


if __name__ == '__main__':
    # read data
    raw_list = read_data_as_list("data.txt")
    # convert to floats and numbers
    conv_list = convert_to_numbers(raw_list)
    # eliminate duplicates
    clean_list = eliminate_duplicates(conv_list)
    # find positive and negative integers
    pos, neg = find_pos_neg_ints(clean_list)
    print("Positive integers: ", (97, 34, 67, 89, 100, 200, 45, 23, 345))
    print("Negative integers: ", (-22, -11, -100))
