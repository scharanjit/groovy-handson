//We can have more than one closure accessing this private variable:

def counterInit, counterIncr, counterDecr, counterShow
//common beginning of names to show common private variable/s
try{
def count
counterInit= { count= it }
counterIncr= { count++ }
counterDecr= { count-- }
counterShow= { count }
} catch(e){println e}

counterInit(0)
counterIncr();
counterIncr();
counterDecr();
counterIncr()

assert counterShow() == 2 
