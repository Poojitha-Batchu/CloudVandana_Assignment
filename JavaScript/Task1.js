function reverseWordsInSentence(sentence) {
    // Split the sentence into words using space as the delimiter.
    var words = sentence.split(' ');

    // Iterate through the words, reverse each word, and store it back.
    for (var i = 0; i < words.length; i++) {
        words[i] = reverseWord(words[i]);
    }

    // Join the reversed words to form the reversed sentence.
    var reversedSentence = words.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into characters, reverse them, and join back into a word.
    var characters = word.split('');
    var reversedWord = characters.reverse().join('');
    return reversedWord;
}

// Example usage:
var inputSentence = "Hello world";
var reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output: "olleH dlrow"
