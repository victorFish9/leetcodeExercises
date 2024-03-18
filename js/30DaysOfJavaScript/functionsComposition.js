function compose(functions) {
    return x => functions.reduceRight((acc, f) => f(acc), x)
}

console.log(compose([x => x + 1, x => x * x, x => 2 * x], x = 4))