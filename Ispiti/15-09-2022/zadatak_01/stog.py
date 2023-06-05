class Stack:

    def __init__(self):
        self.__size = 0
        self.__structure = []

    def is_empty(self):
        return self.__size == 0

    def top(self):
        if self.is_empty():
            print("Stack is empty - nothing to show")
        else:
            return "element on top is: " + self.__structure[self.__size - 1]

    def pop(self):
        element = None
        if self.is_empty():
            print("Stack is empty - nothing to pop")
        else:
            self.__size -= 1
            element = self.__structure.pop()
        return element

    def push(self, element):
        self.__size += 1
        self.__structure.append(element)

    def size(self):
        return self.__size

    def __repr__(self):
        return self.__structure.__repr__() + " | size => " + self.__size.__repr__()


if __name__ == '__main__':
    stog1 = Stack()
    stog1.push(1)
    stog1.push(12)
    stog1.push(10)
    stog1.push(6)
    print(stog1)
    stog1.size()
    stog1.pop()
    stog1.size()
    print(stog1)
    print(stog1.is_empty())
    print(stog1.top())

