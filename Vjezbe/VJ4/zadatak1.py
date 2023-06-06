def print_msg(n):
    if n == 0:
        pass
    elif n == 1:
        print("Ovo je poruka :-)")
    else:
        print("Ovo je poruka :-)")
        return print_msg(n - 1)


if __name__ == '__main__':
    print_msg(3)
    print("-----------------------------------")
    print_msg(0)
