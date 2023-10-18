// Perform sorting of an array in descending order.

var arr = [2,3,42,77,5,63]
for(let i = 0; i < arr.length; i++){
    for(let j = i; j< arr.length; j++){
        if(arr[i]<arr[j]){
            let temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp
        }
    }
}
console.log(arr)