/**
 * @param {number[]} nums
 * @return {number}
 */
var missingInteger = function (nums) {
    let sum_of_sequential = nums[0]
    for (let i = 1; i <= nums.length; i++) {
        if (nums[i] - 1 === nums[i - 1]) {
            sum_of_sequential += nums[i]
        }
        else {
            break
        }
    }

    while (true) {
        if (!(nums.includes(sum_of_sequential))) {
            return sum_of_sequential
        } else {
            ++sum_of_sequential
        }
    }
};

var numbers = [29, 30, 31, 32, 33, 34, 35, 36, 37];
// var numbers = [5, 2, 10];
console.log(missingInteger(numbers));