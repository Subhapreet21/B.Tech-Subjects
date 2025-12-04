"""
Given a sentence, write a program that counts how many times each word appears. And 
upload add the code to Git repository 
Example: 
Input: "the cat and the hat" 
Output: {'the': 2, 'cat': 1, 'and': 1, 'hat': 1}
"""

def word_frequency(sentence): 
    # Convert to lowercase 
    sentence = sentence.lower() 
     
    # Split into words 
    words = sentence.split() 
     
    # Dictionary to store word counts 
    freq = {} 
     
    for word in words: 
        if word not in freq: 
            freq[word] = 1 
        else: 
            freq[word] += 1 
             
    return freq 
 
 
# Example 
sentence = "the cat and the hat" 
result = word_frequency(sentence) 
print(result)  # Output: {'the': 2, 'cat': 1, 'and': 1, 'hat': 1}