"""
Write a Python program that removes duplicates from a list without using set(), while 
preserving the original order.And upload add the code to Git repository 
Input: 
numbers = [4, 2, 4, 5, 2, 3, 5, 1] 
Output: 
[4, 2, 5, 3, 1] 
"""

def remove_duplicates(lst): 
    unique_list = [] 
    for item in lst: 
        if item not in unique_list: 
            unique_list.append(item) 
    return unique_list 
 
# Example input 
numbers = [4, 2, 4, 5, 2, 3, 5, 1] 
 
# Remove duplicates 
result = remove_duplicates(numbers) 
print(result)  # Output: [4, 2, 5, 3, 1] 