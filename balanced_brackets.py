def reverse_words(input_string: str) -> str:
    # Split the input string into a list of words
    words = input_string.split()
    # Reverse the list of words and join them back into a string
    reversed_string = ' '.join(reversed(words))
    return reversed_string


