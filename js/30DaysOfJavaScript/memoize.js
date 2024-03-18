function memoize(fn) {
    let cache = {};

    return function (...args) {
        const argString = JSON.stringify(args)

        if (argString in cache) {
            return cache[argString];
        } else {
            let temp = fn(...args)
            cache[argString] = temp
            return temp
        }

    }
}