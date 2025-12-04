"""
Given a 2D list (matrix), write Python code that prints its transpose.And upload add the 
code to Git repository 
Example: 
Input: 
[[1, 2], [3, 4], [5, 6]] 
Output: 
[[1, 3, 5], [2, 4, 6]]
"""

# def transpose_matrix(matrix): 
#     # Use list comprehension to transpose 
#     transposed = [[row[i] for row in matrix] for i in range(len(matrix[0]))] 
#     return transposed 

def transpose_matrix(matrix): 
    rows = len(matrix)
    cols = len(matrix[0])

    transposed=[[] for _ in range(cols)]
    
    for i in range(rows):
        for j in range(cols):
            transposed[j].append(matrix[i][j])

    return transposed
 
# Example 
matrix = [[1, 2], [3, 4], [5, 6]] 
result = transpose_matrix(matrix) 
print(result)  # Output: [[1, 3, 5], [2, 4, 6]]