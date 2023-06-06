from zadatak2 import *


def powr(x, n):
    if n == 0:
        return 1
    elif n > 0 and n % 2 == 1:
        return x * (powr(x, abs(n // 2)) * powr(x, abs(n // 2)))
    elif n > 0 and n % 2 == 0:
        return powr(x, abs(n // 2)) * powr(x, abs(n // 2))


def avg(funct1, funct2):
    our_sum = 0
    for i in range(1_000):
        our_sum += funct1(funct2, [29])
    our_average = our_sum / 1_000
    return print(f"Average of calling function: {funct2.__name__} 1000 times is: {our_average} s")


if __name__ == '__main__':
    avg(timer, recursion)
    avg(timer, looping)
    avg(timer, powr)
