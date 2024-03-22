/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    let result = []
    for (i = 0; i < arr.length; i += size) {
        result.push(arr.slice(i, i + size))
    }
    return result
};

chunk([1, 2, 3, 4, 5], 1)