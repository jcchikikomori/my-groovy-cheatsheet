package com.jcchikikomori.samples

class Test {
    def i
    def j
    Test(i, j) {
        this.i = i
        this.j = j
    }
}

def test = new Test(1, 2)
assert test.i == 1
assert test.j == 2

println "${test.i} ${test.j} 3"
println 'Success'