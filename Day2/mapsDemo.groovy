def map= ['id':'FX-11', 'name':'Radish','no':1234, 99:'Y', 'name':'rrr', 'name':'Radish', 'name':'Radish']

println map  //unique key

def map2= [
'id': 'FX-17',
name: 'Turnip', //string-keys that are valid identifiers need not be quoted
99: 123,        //any data can be a key
(-97): 987,     //keys with complex syntax must be parenthesized
"tail's": true, //trailing comma OK
]


println map2