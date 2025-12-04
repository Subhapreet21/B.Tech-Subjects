"""
Write a program that reverses the order of words in a string.And upload add the code to 
Git repository 
Example: "hello world python" → "python world hello" 
"""

def reverse_words(sentence): 
    # Split the sentence into words 
    words = sentence.split() 
     
    # Reverse the list of words 
    words.reverse() 
     
    # Join the reversed list back into a string 
    reversed_sentence = ' '.join(words) 
     
    return reversed_sentence

# Example
sentence = "hello world python"
result = reverse_words(sentence)
print(result)  # Output: "python world hello"