// Take a sentence as an input and reverse every word in that sentence. 
// Example - This is a sunny day > shiT si a ynnus yad.

var sentence = "This is a sunny day"
var wordsarray = sentence.split(' ')
console.log(wordsarray)
var reversedword = []
var newstring = ""
for(let i = 0; i < wordsarray.length; i++){
    let word = ""
    for(let j = (wordsarray[i].length-1); j > -1; j--){
        word+=(wordsarray[i])[j]
    }
    reversedword.push(word)
}
newstring = reversedword.join(' ')
console.log(newstring)