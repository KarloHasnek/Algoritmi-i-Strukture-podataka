from timeit import default_timer


def recursion(x, n):
    if n == 0:
        return 1
    else:
        return x * recursion(x, n-1)


def looping(x, n):
    res = 1
    if n != 0:
        for i in range(n):
            res *= x
    else:
        res = 1

    return res


def timer(f, l):

    timer1 = default_timer()
    for i in l:
        f(2, i)
    timer2 = default_timer()

    return timer2 - timer1


if __name__ == '__main__':
    l = [2, 5, 7, 11, 15, 25, 30, 50, 63]
    print(f"recursion timer --> {timer(recursion, l)}")
    print(f"looping   timer --> {timer(looping, l)}")