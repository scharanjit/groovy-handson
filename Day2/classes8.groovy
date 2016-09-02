class Dog{
    def sit
    def number
    def train(){ ([sit()] * number).join(' ')}
    
}
def d= new Dog( number:3, sit:{'Down boy!'})

assert d.train() == 'Down boy! Down boy! Down boy!'
