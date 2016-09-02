//expando power
//An expando can also be used when common private variables aren't used:


def language= new Expando()
language.name= "Groovy"
language.numLetters= { name.size() }
assert language.numLetters() == 6
language.name= "Ruby"
assert language.numLetters() == 4
language.name= "PHP"
assert language.numLetters() == 2
