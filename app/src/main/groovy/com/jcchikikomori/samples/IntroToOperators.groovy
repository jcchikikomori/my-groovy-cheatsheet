package com.jcchikikomori.samples
// SPECIALIZED
def map = [1:"Vishal", 2:"Chris", 3:"Joseph", 4:"Jim"]
def keys = [1, 2, 3, 4]
def values = ["Vishal", "Chris", "Joseph", "Jim"]

// ELVIS
def firstName = map.get(1) == null ? "unknown" : map.get(1) // Java ternary
def firstName2 = map[3] ?: "unknown" // Groovy Elvis

//println map*.key
//println keys
//println map*.value
//println values

try {
    assert map*.key == keys
    assert map*.value == values
    //assert map*.key == values // this should be error
    
    println firstName
    println firstName2

    println 'Success'
} catch (Exception e) {
    println e.message
}