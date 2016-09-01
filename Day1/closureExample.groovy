//Closures are similar to Java's inner classes, except they are a single method which is invokable, with arbitrary
//parameters. A closure can have as many parameters as you wish...

def closure = { param -> println("hello ${param}") }
closure.call("world!")
closure = { greeting, name -> println(greeting + name) }
closure.call("hello ", "world!")

//If no parameter(s) is(are) specified before -> symbol then a default named parameter, called 'it' can be used. e.g.
def closure1 = { println "hello " + it }
closure1.call("worldwaaaaaaaaaa!")


[1, 2, 3, 4, 5, 6, 7, 8].each ({ item -> print "${item}---"})
println("")
["k1":"v1", "k2":"v2","k3":"v3"].each {key, value -> println key + "=" + value}

