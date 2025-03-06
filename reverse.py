def reverse_words(input_string: str) -> str:
    
    words = input_string.split()
    
    return ' '.join(words[::-1])

input_string = "Hello world"
result = reverse_words(input_string)
print(result)  
