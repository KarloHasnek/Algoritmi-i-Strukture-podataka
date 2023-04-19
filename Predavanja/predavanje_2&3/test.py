from pckg_VJ1.sort_descending import generate_random_list, sort_swap, elapsed_time

lst = generate_random_list(7)
print(lst)
lst = sort_swap(lst)
print(lst)
time = elapsed_time(sort_swap, lst)
print(f"Elapsed time: {time}")
