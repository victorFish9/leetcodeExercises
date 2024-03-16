function createCounter(number) {
    let reset_num = number
    return {
        increment: () => {
            return ++reset_num
        },
        decrement: () => {
            return --reset_num
        },
        reset: () => {
            return (reset_num = number)
        }
    }
}