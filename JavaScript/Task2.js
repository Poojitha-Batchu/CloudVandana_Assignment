// Sample array to be sorted in descending order
var numbers = [5, 2, 9, 1, 5, 6];

// Custom sort function for descending order
function compareDescending(a, b) {
    return b - a;
}

// Use the sort method with the custom comparison function
numbers.sort(compareDescending);

console.log("Sorted array in descending order: " + numbers);

