"""
Write a program that finds all elements appearing in both lists (duplicates allowed only 
once). And upload add the code to Git repository 
Example: 
List1 = [1, 2, 3, 4] 
List2 = [3, 4, 5, 6] 
Output → [3, 4]
"""

def find_common_elements(list1, list2): 
    common = [] 
    for item in list1: 
        if item in list2 and item not in common: 
            common.append(item) 
    return common 
 
# Example 
list1 = [1, 2, 3, 4] 
list2 = [3, 4, 5, 6] 
 
result = find_common_elements(list1, list2) 
print(result)  # Output → [3, 4]