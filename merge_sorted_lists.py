def merge_sorted_lists(list1: list, list2: list) -> list:
    merged_list = []
    while list1 and list2:
        # Compare the first elements of both the lists
        if list1[0] < list2[0]:
            merged_list.append(list1.pop(0))
        else:
            merged_list.append(list2.pop(0))
            
    merged_list.extend(list1 if list1 else list2)
    return merged_list

# Example:
list1 = [1, 3, 5, 7]
list2 = [2, 4, 6, 8]
result = merge_sorted_lists(list1, list2)
print(result) 
