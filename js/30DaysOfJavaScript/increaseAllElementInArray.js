var map = function (arr, fn) {
    const x = []

    for (let i = 0; i < arr.length; i++) {
        x.push(fn(arr[i], i))
    }
    return x
};

console.log(map([1, 2, 3], function plusI(n, i) { return n + i; }))