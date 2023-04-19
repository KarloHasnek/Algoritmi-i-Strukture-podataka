from typing import *
from sort_ascending import sort_swap as sort_1
from sort_descending import sort_swap as sort_2


def sort_asc_desc(lst: List, sort_type: str = "desc"):
    assert sort_type in ["desc", "asc"]
    if sort_type == "asc":
        sort_1(lst)
    else:
        sort_2(lst)
        