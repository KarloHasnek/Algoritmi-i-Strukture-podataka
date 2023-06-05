# import from module
from random import seed

from lab4 import rand_search

# random seed
seed(123)

some_string = "this is some string that will be used in the code"
search_string = "strings"

# test for strings
input_data = list(some_string.split())

# print status
rand_search(input_data, search_string)