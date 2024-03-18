function reduce(nums, fn, init) {
    let answer = init
    for (var i = 0; i < nums.length; i++) {
        answer = fn(answer, nums[i])
    }
    return answer
}