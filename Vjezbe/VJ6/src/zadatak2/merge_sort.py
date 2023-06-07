def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    # Podjela u 2 array-a
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    # Sortiranje svakog array-a
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)

    # Merge array-a
    merged = merge(left_half, right_half)
    return merged


def merge(left, right):

    merged = []
    i = 0
    j = 0

    # Dodavanje elemenata u merged array
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            merged.append(left[i])
            i += 1
        else:
            merged.append(right[j])
            j += 1

    # Dodavanje preostalih elemenata
    while i < len(left):
        merged.append(left[i])
        i += 1
    while j < len(right):
        merged.append(right[j])
        j += 1

    return merged


if __name__ == "__main__":
    arr = [15, 95, 65, 35, 25, -10, 75, 45, 85, 55]
    sorted_arr = merge_sort(arr)
    print(sorted_arr)