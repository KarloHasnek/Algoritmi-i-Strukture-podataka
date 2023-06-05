from zadatak_01.stog import *
from random import randint


def sum_stogs(stog1: Stack, stog2: Stack) -> Stack:
    stg3 = Stack()

    while(True):
        if not stog1.is_empty() and not stog2.is_empty():
            stg3.push(stog1.pop() + stog2.pop())
        elif not stog1.is_empty() and stog2.is_empty():
            stg3.push(stog1.pop())
        elif stog1.is_empty() and not stog2.is_empty():
            stg3.push(stog2.pop())
        else:
            break

    return stg3


if __name__ == '__main__':
    stg1 = Stack()
    stg2 = Stack()

    for i in range(8):
        stg1.push(randint(1, 30))
        stg2.push(randint(1, 30))

    stg2.push(28)

    print(stg1)
    print(stg2)

    print(sum_stogs(stg1, stg2))
