package com.jcchikikomori.samples
/* groovylint-disable VariableTypeRequired */
closureVar = { println 'Hello world' }
println 'closure is not called yet'
println ' '
closureVar.call()
