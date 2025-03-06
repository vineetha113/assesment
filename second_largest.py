def second_largest(numbers: list) -> int:

    unique_numbers = sorted(set(numbers))

    return unique_numbers[-2] if len(unique_numbers) > 1 else None

# Example:
numbers = [12, 45, 1, -10, 45, 67, 67]
result = second_largest(numbers)
print(result)  