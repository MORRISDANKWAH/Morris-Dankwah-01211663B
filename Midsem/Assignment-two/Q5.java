def sum_of_2d_array(arr):
total = 0
        for row in arr:
        for element in row:
total += element
    return total

# Example usage:
array = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
        ]

print("Sum of all elements in the 2D array:", sum_of_2d_array(array))
