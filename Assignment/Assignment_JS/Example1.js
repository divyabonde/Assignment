function reverseWords(sentence)
{
    const words = sentence.split('');
    const reverseWords = words.map(word => word.split(").reverse().join("));
    return reverseWords.join('');
}
const inputSentence = "This is a sunny day";
console.log(reverseWords(inputSentence));
