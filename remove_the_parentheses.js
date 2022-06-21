// In this kata you are given a string for example:

// "example(unwanted thing)example"
// Your task is to remove everything inside the parentheses as well as the parentheses themselves.

// The example above would return:

// "exampleexample"

function removeParentheses(s){
    var str = s
    // var reverseStr = str.split("").reverse().join("")
    if (str.indexOf(")") != null && str.indexOf("(") != null && str.indexOf("(") < str.indexOf(")")){
        str = str.replace(str.slice(str.indexOf("("), str.indexOf(")") + 1), "")
    }
    return str

}

console.log(removeParentheses("test(test)test"))
console.log(removeParentheses("tes(t(test)te)st"))
console.log(removeParentheses("te(st(test)test"))
console.log(removeParentheses("te(st(test)tes))t"))
console.log(removeParentheses("()te(st(test)test"))
